package javaapplication5;
public class Book {
  private String title;
  private String author;
  private int isbn ;

  public Book(String title, String author,int isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
  public int getISBN(){
      return isbn;
  }
public void setTitel(int isbn){
    this.isbn = isbn;
  }
}
package javaapplication5;

//Library.java
import java.util.ArrayList;

public class Library {
  private ArrayList < Book > books;

  public Library() {
    books = new ArrayList < Book > ();
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public void removeBook(Book book) {
    books.remove(book);
  }

  public ArrayList < Book > getBooks() {
    return books;
  }
}
package javaapplication5;

public class Main {
  public static void main(String[] args) {
    Library library = new Library();

    Book book1 = new Book("Adventures of Tom Sawyer",
             "Mark Twain",1876);
    Book book2 = new Book("Ben Hur", 
             "Lew Wallace",1852);
    Book book3 = new Book("Time Machine", 
             "H.G. Wells",1960);
    Book book4 = new Book("Anna Karenina", 
             "Leo Tolstoy",1960);

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.addBook(book4);

    System.out.println("Books in the library:");
    for (Book book: library.getBooks()) {
      System.out.println ("Title: "+book.getTitle());
      System.out.println ("Author: "+book.getAuthor());
      System.out.println ("ISBN: "+book.getISBN());
    }

    library.removeBook(book2);
    System.out.println("\nBooks in the library after removing " + book2.getTitle() + ":");
    for (Book book: library.getBooks()) {
      System.out.println(book.getTitle() + " by " + book.getAuthor());
      System.out.println("ISBN:"+book.getISBN());
    }
  }
}
