/**
 * MIT License
 *
 * Copyright (c) 2024 Scott Davis
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
 
package main.java.com.s1scottd.Printf;
public class SalesReport {
  public static void main(String[] args) {
    // Sample sales data
    String[][] salesData = {
        { "John Doe", "45", "1245.50", "5.5" },
        { "Jane Smith", "120", "21500.75", "8.0" },
        { "Bill Turner", "3", "45.00", "-2.5" },
    };

    // Print the report header
    System.out.println("-----------------------------------------------");
    System.out.printf("%-15s %5s %7s %17s%n", "Name", "Units", "Sales", "Commission");
    System.out.println("-----------------------------------------------");

    // Iterate over each sales record and print formatted output
    for (String[] sales : salesData) {
      String name = sales[0];
      int units = Integer.parseInt(sales[1]);
      double salesAmount = Double.parseDouble(sales[2]);
      double commission = Double.parseDouble(sales[3]);

      // Print the formatted sales data using printf
      System.out.printf("%-15s %05d %10.2f %8.2f%%%n", name, units, salesAmount, commission);
    }
  }
}
