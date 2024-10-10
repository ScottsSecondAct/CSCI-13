public class Book {
  private String title;
  private String authorFirstName;
  private String authorLastName;
  private String ISBN;
  private String genre;
  private boolean isCheckedOut;

  public Book(String title, String authorFirstName, String authorLastName, String ISBN, String genre) {
    this.title = title;
    this.authorFirstName = authorFirstName;
    this.authorLastName = authorLastName;
    this.ISBN = ISBN;
    this.genre = genre;
    this.isCheckedOut = false;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthorFirstName() {
    return authorFirstName;
  }

  public void setAuthorFirstName(String authorFirstName) {
    this.authorFirstName = authorFirstName;
  }

  public String getAuthorLastName() {
    return authorLastName;
  }

  public void setAuthorLastName(String authorLastName) {
    this.authorLastName = authorLastName;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public boolean isCheckedOut() {
    return isCheckedOut;
  }

  public void setCheckedOut(boolean checkedOut) {
    isCheckedOut = checkedOut;
  }

  @Override
  public String toString() {
    return "Book{" +
        "title='" + title + '\'' +
        ", authorFirstName='" + authorFirstName + '\'' +
        ", authorLastName='" + authorLastName + '\'' +
        ", ISBN='" + ISBN + '\'' +
        ", genre='" + genre + '\'' +
        ", isCheckedOut=" + isCheckedOut +
        '}';
  }
}