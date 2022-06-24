package skypro.course1.HW10;

public class Application {

    private static void printSeparator() {
        System.out.println("**********************************");
    }

    public static void main(String[] args) {

        Author author1 = new Author("Михаил", "Лермонтов");
        Author author2 = new Author("Александр", "Пушкин");
        Author author3 = new Author("Михаил", "Лермонтов");

        Book book1 = new Book("Герой нашего времени", 2015, author1);
        Book book2 = new Book("Капитанская дочка", 1841, author2);
        Book book3 = new Book("Мцыри", 1838, author3);

        System.out.println(book1);
        printSeparator();
        System.out.println(book2);
        printSeparator();
        System.out.println(book3);
        printSeparator();

        book2.setPublicationYear(1836);
        System.out.println("firstPublicationYear: " + book2.getPublicationYear());
        printSeparator();

        System.out.println("Хэш первого автора: " + author1.hashCode() + "\n" + "Хэш третьего автора: " + author3.hashCode());
        System.out.println("Сравнение книг: " + book1.equals(book3));
        System.out.println("Сравнение авторов: " + author1.equals(author3));


    }
}
