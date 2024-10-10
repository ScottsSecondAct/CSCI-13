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
 
public class LibraryTest {
  public static void main(String[] args) {
    Library library = new Library();

    // Create some books
    Book book1 = new Book("The Great Gatsby", "F. Scott", "Fitzgerald", "123456789", "Fiction");
    Book book2 = new Book("1984", "George", "Orwell", "987654321", "Dystopian");
    Book book3 = new Book("To Kill a Mockingbird", "Harper", "Lee", "123987654", "Fiction");

    // Create some patrons
    Patron patron1 = new Patron("John", "Doe", "1234567890", "P001");
    Patron patron2 = new Patron("Jane", "Smith", "0987654321", "P002");

    // Add books and patrons to the library
    library.add(book1);
    library.add(book2);
    library.add(book3);
    library.add(patron1);
    library.add(patron2);

    // Borrow a book
    patron1.borrowBook(book1);

    // Print patron last names
    library.printLastNames();

    // Search for a book
    Book foundBook = (Book) library.search("1984");
    if (foundBook != null) {
      System.out.println("Book found: " + foundBook);
    } else {
      System.out.println("Book not found");
    }

    // Delete a book
    library.delete(book2);
  }
}
