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
 
import java.util.Scanner;

public class LibraryManager {
  public static void main(String[] args) {
    Library library = new Library();
    Scanner scanner = new Scanner(System.in);
    boolean running = true;

    while (running) {
      System.out.println("\nLibrary Manager:");
      System.out.println("1. Add a book");
      System.out.println("2. List all books");
      System.out.println("3. Search for a book by title");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();
      scanner.nextLine(); // Consume newline

      switch (choice) {
        case 1:
          System.out.print("Enter title: ");
          String title = scanner.nextLine();
          System.out.print("Enter author: ");
          String author = scanner.nextLine();
          System.out.print("Enter year published: ");
          int year = scanner.nextInt();
          scanner.nextLine(); // Consume newline
          System.out.print("Enter ISBN: ");
          String ISBN = scanner.nextLine();
          Book book = new Book(title, author, year, ISBN);
          library.addBook(book);
          System.out.println("Book added successfully.");
          break;
        case 2:
          library.listBooks();
          break;
        case 3:
          System.out.print("Enter the title to search: ");
          String searchTitle = scanner.nextLine();
          library.searchByTitle(searchTitle);
          break;
        case 4:
          running = false;
          System.out.println("Exiting Library Manager.");
          break;
        default:
          System.out.println("Invalid choice.");
      }
    }
    scanner.close();
  }
}
