package skypro.course1.HW10;

import java.util.Objects;

public class Book {
   private final String bookName;
   private int publicationYear;
   private final Author author;

   public Book(String bookName, int publicationYear, Author author) {
      this.bookName = bookName;
      this.publicationYear = publicationYear;
      this.author = author;
   }

   public String getBookName () {
      return this.bookName;
   }

   public Author getAuthor() {
      return this.author;
   }

   public int getPublicationYear() {
      return this.publicationYear;
   }

   public void setPublicationYear(int publicationYear) {
      this.publicationYear = publicationYear;
   }

   @Override
   public String toString() {
      return "Книга: " + bookName +
              "\nГод публикации: " + publicationYear +
              "\nАвтор: " + author;
   }
   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Book book = (Book) o;
      return publicationYear == book.publicationYear && bookName.equals(book.bookName) && author.equals(book.author);
   }

   @Override
   public int hashCode() {
      return Objects.hash(bookName, publicationYear, author);
   }
}
