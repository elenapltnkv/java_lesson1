package ru.geegbrains.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("---------");
        System.out.println("| Orange |");
        System.out.println("| Banana |");
        System.out.println("| Apple  |");
        System.out.println("---------");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 3;
        int c = a + b;
        System.out.println(c);
        if (c > 0) {
            System.out.println("Сумма положительная");
        }
    }

    public static void printColor() {
        int value = 101;
        if (value > 0 && value < 100) {
            System.out.println("Желтый");
        }
        if (value < 0) {
            System.out.println("Красный");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a = 3;
        int b = 3;
        if (a > b) {
            System.out.println("a > b");
        }
        if (a <= b) {
            System.out.println("a <= b");
        }
    }
}
