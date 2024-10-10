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
