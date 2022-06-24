package skypro.course1.HW10;

public class Application {

    private static void printSeparator() {
        System.out.println("**********************************");
    }

    public static void main(String[] args) {

        Author author1 = new Author("Михаил", "Лермонтов");
        Author author2 = new Author("Александр", "Пушкин");

        Book book1 = new Book("Герой нашего времени", 2015, author1);
        Book book2 = new Book("Капитанская дочка", 1841, author2);

        System.out.println(book1);

        printSeparator();

        System.out.println(book2);

        printSeparator();

        book2.setPublicationYear(1836);
        System.out.println("firstPublicationYear: " + book2.getPublicationYear());



    }
}
