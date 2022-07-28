package skypro.course2.HW2_4;

public class Main {

    public static void main(String[] args) {
        boolean result = Validator.validate("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        if (result) {
            System.out.println("Данные корректны");
        } else {
            System.out.println("Данные не корректны");
        }
    }
}
