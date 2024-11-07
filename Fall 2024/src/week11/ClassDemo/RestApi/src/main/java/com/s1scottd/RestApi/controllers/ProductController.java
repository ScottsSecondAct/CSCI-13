package com.s1scottd.RestApi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.s1scottd.models.Product;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/api/products")
@Tag(name = "Products API")
public class ProductController {

  private List<Product> products = new ArrayList<>();

  @GetMapping
  public List<Product> getAllProducts() {
    return products;
  }

  @Operation(summary = "Get a product by id", description = "Returns a product as per the id")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Successfully retrieved"),
      @ApiResponse(responseCode = "404", description = "Not found - The product was not found")
  })
  @GetMapping("/{id}")
  public ResponseEntity<Product> getProductById(
      
       @PathVariable("id") @Parameter(name = "id", description = "Product id",
       example = "1")
        int id) {
    Product product = findProductById(id);
    if (product != null) {
      return ResponseEntity.ok(product);
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
  }

  @PostMapping
  public ResponseEntity<Product> createProduct(@RequestBody Product product) {
    products.add(product);
    return ResponseEntity.status(HttpStatus.CREATED).body(product);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {
    Product product = findProductById(id);
    if (product != null) {
      product.setName(updatedProduct.getName());
      product.setPrice(updatedProduct.getPrice());
      return ResponseEntity.ok(product);
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteProduct(@PathVariable int id) {
    Product product = findProductById(id);
    if (product != null) {
      products.remove(product);
      return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
  }

  private Product findProductById(int id) {
    return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
  }
}
