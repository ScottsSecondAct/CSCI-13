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
 
public class Patron extends Person {
  private String libraryCardNumber;
  private Book[] borrowedBooks;
  private int bookCount;

  public Patron(String firstName, String lastName, String phone, String libraryCardNumber) {
    super(firstName, lastName, phone);
    this.libraryCardNumber = libraryCardNumber;
    this.borrowedBooks = new Book[5]; // A patron can borrow up to 5 books.
    this.bookCount = 0;
  }

  public String getLibraryCardNumber() {
    return libraryCardNumber;
  }

  public void setLibraryCardNumber(String libraryCardNumber) {
    this.libraryCardNumber = libraryCardNumber;
  }

  public void borrowBook(Book book) {
    if (bookCount < 5 && !book.isCheckedOut()) {
      borrowedBooks[bookCount] = book;
      book.setCheckedOut(true);
      bookCount++;
    } else {
      System.out.println("Cannot borrow more books or book already checked out.");
    }
  }

  public void returnBook(Book book) {
    for (int i = 0; i < bookCount; i++) {
      if (borrowedBooks[i] != null && borrowedBooks[i].equals(book)) {
        borrowedBooks[i].setCheckedOut(false);
        borrowedBooks[i] = null;
        bookCount--;
        break;
      }
    }
  }

  @Override
  public String toString() {
    return super.toString() + " Patron{" +
        "libraryCardNumber='" + libraryCardNumber + '\'' +
        ", borrowedBooks=" + bookCount + " books borrowed" +
        '}';
  }
}
