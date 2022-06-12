package skypro.course1.HW9;

public class Application {

    private static void printSeparator() {
        System.out.println("**********************************");
    }

    public static void main(String[] args) {

        Author author1 = new Author("Михаил", "Лермонтов");
        Author author2 = new Author("Александр", "Пушкин");

        Book book1 = new Book ("Герой нашего времени", 2015, author1);
        Book book2 = new Book ("Капитанская дочка", 1841, author2);

        System.out.println("Book1: ");
        System.out.println("bookName: " + book1.getBookName());
        System.out.println("authorName: " + book1.getAuthor().getFirstName() + " "+ book1.getAuthor().getSecondName());
        System.out.println("publicationYear: " + book1.getPublicationYear());

        printSeparator();

        System.out.println("Book2: ");
        System.out.println("bookName: " + book2.getBookName());
        System.out.println("authorName: " + book2.getAuthor().getFirstName() +" "+ book2.getAuthor().getSecondName());
        System.out.println("publicationYear: " + book2.getPublicationYear());

        printSeparator();

        book2.setPublicationYear(1836);
        System.out.println("firstPublicationYear: " + book2.getPublicationYear());

    }
}
