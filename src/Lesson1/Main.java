package Lesson1;

public class Main {

    public static void main(String[] args) {

        // 1
        printThreeWords();

        // 2
        checkSumSign();

        // 3
        printColor();

        // 4
        compareNumbers();

        // 5
        System.out.println(checkSumInRange(5, 10));

        // 6
        checkNumber(-5);

        // 7
        System.out.println(isNegative(-10));

        // 8
        printString("Hello", 3);

        // 9
        System.out.println(isLeapYear(2024));

        // 10
        invertArray();

        // 11
        fillArray();

        // 12
        multiplyLessThanSix();

        // 13
        fillDiagonal();

        // 14
        int[] resultArray = createArray(5, 7);

        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }

    // 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2
    public static void checkSumSign() {
        int a = 5;
        int b = -2;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3
    public static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4
    public static void compareNumbers() {
        int a = 10;
        int b = 5;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5
    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;

        return sum >= 10 && sum <= 20;
    }

    // 6
    public static void checkNumber(int number) {

        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    // 7
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8
    public static void printString(String text, int count) {

        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    // 9
    public static boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0)
                || (year % 400 == 0);
    }

    // 10
    public static void invertArray() {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    // 11
    public static void fillArray() {

        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    // 12
    public static void multiplyLessThanSix() {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    // 13
    public static void fillDiagonal() {

        int size = 5;

        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            arr[i][i] = 1;
        }

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    // 14
    public static int[] createArray(int len, int initialValue) {

        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }

        return arr;
    }
}

