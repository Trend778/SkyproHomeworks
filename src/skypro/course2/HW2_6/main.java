package skypro.course2.HW2_6;

import java.util.*;

public class main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> fruits = new ArrayList<>(List.of("Apple", "Banana", "Pineapple", "Apple", "Orange", "Lemon", "Pear", "Banana"));

        task1(nums);
        task2(nums);
        task3(fruits);
        task4(List.of("Apple", "Banana", "Pineapple", "Apple", "Orange", "Lemon", "Pear", "Banana"));
    }

    public static void task1(List<Integer> nums) {
        System.out.println("Задание 1");
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void task2(List<Integer> nums) {
        System.out.println("Задание 2");
        Set<Integer> setNums = new TreeSet<>(nums);
        for (Integer num : setNums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void task3(List<String> fruits) {
        System.out.println("Задание 3");
        Set<String> setFruits = new HashSet<>(fruits);
        for (String fruit : setFruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }

    public static void task4(List<String> words) {
        System.out.println("Задание 4");
        Map<String , Integer> mapFruits = new HashMap<>();
        for (String fruit : words) {
            if (mapFruits.containsKey(fruit)) {
                mapFruits.put(fruit, mapFruits.get(fruit) + 1);
            } else {
                mapFruits.put(fruit, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : mapFruits.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry);
            }
        }
    }
}
