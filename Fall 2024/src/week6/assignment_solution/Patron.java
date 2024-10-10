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
