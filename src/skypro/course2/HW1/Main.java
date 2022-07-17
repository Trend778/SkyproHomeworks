package skypro.course2.HW1;

import java.util.Random;

public class Main {
    private static final Random random = new Random();

    private static void printSeparator() {
        System.out.println("****************************************************");
    }

    public static void main(String[] args) {
        GryffindorStudent harry = generateGryffindorStudent("Гарри Поттер");
        GryffindorStudent hermione = generateGryffindorStudent("Гермиона Грейнджер");
        GryffindorStudent ron = generateGryffindorStudent("Рон Уизли");
        HufflepuffStudent zacharias = generateHufflepuffStudent("Захария Смит");
        HufflepuffStudent cedric = generateHufflepuffStudent("Седрик Диггори");
        HufflepuffStudent justin = generateHufflepuffStudent("Джастин Финч-Флетчли");
        RavenclawStudent cho = generateRavenclawStudent("Чжоу Чанг");
        RavenclawStudent padma = generateRavenclawStudent("Падма Патил");
        RavenclawStudent marcus = generateRavenclawStudent("Маркус Белби");
        SlytherinStudent draco = generateSlytherinStudent("Драко Малфой");
        SlytherinStudent gregory = generateSlytherinStudent("Грегори Гойл");
        SlytherinStudent graham = generateSlytherinStudent("Грэхэм Монтегю");

        harry.print();
        zacharias.print();
        padma.print();
        draco.print();

        printSeparator();

        ron.compareGryffindor(hermione);
        gregory.compareSlytherin(graham);
        cedric.compareHogwarts(cho);
        justin.compareHogwarts(marcus);

    }

    public static GryffindorStudent generateGryffindorStudent(String name) {  //генерация характеристик гриффиндорца
        return new GryffindorStudent(
                name,
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
        );
    }

    public static HufflepuffStudent generateHufflepuffStudent(String name) {  //генерация характеристик пуффендуйца
        return new HufflepuffStudent(
                name,
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
        );
    }

    public static RavenclawStudent generateRavenclawStudent(String name) {  //генерация характеристик когтевранца
        return new RavenclawStudent(
                name,
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
        );
    }

    public static SlytherinStudent generateSlytherinStudent(String name) {  //генерация характеристик слизеринца
        return new SlytherinStudent(
                name,
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)
        );
    }
}
