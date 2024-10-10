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
 
public class Library implements Inventory {
  private Book[] books;
  private Patron[] patrons;
  private int bookCount;
  private int patronCount;

  public Library() {
    this.books = new Book[10];
    this.patrons = new Patron[10];
    this.bookCount = 0;
    this.patronCount = 0;
  }

  @Override
  public boolean add(Object o) {
    if (o instanceof Book) {
      if (bookCount < books.length) {
        books[bookCount] = (Book) o;
        bookCount++;
        return true;
      } else {
        System.out.println("Library inventory is full.");
      }
    } else if (o instanceof Patron) {
      if (patronCount < patrons.length) {
        patrons[patronCount] = (Patron) o;
        patronCount++;
        return true;
      } else {
        System.out.println("Library patron list is full.");
      }
    }
    return false;
  }

  @Override
  public Object search(Object o) {
    if (o instanceof String) {
      String searchTitle = (String) o;
      for (int i = 0; i < bookCount; i++) {
        if (books[i] != null && books[i].getTitle().equalsIgnoreCase(searchTitle)) {
          return books[i];
        }
      }
    }
    return null;
  }

  @Override
  public boolean delete(Object o) {
    if (o instanceof Book) {
      Book bookToDelete = (Book) o;
      for (int i = 0; i < bookCount; i++) {
        if (books[i] != null && books[i].equals(bookToDelete)) {
          books[i] = null;
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public void printLastNames() {
    for (int i = 0; i < patronCount; i++) {
      if (patrons[i] != null) {
        System.out.println(patrons[i].getLastName());
      }
    }
  }
}
