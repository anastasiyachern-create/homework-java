package Lesson5;

public class MainExceptions {

    public static void main(String[] args) {

        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "abc", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        try {

            int sum = sumArray(validArray);

            System.out.println("Сумма массива: " + sum);

        } catch (MyArraySizeException e) {

            System.out.println("Ошибка размера массива:");
            System.out.println(e.getMessage());

        } catch (MyArrayDataException e) {

            System.out.println("Ошибка данных массива:");
            System.out.println(e.getMessage());
        }

        System.out.println();
        try {

            int sum = sumArray(invalidDataArray);

            System.out.println("Сумма массива: " + sum);

        } catch (MyArraySizeException e) {

            System.out.println("Ошибка размера массива:");
            System.out.println(e.getMessage());

        } catch (MyArrayDataException e) {

            System.out.println("Ошибка данных массива:");
            System.out.println(e.getMessage());
        }

        System.out.println();

        try {

            int sum = sumArray(invalidSizeArray);

            System.out.println("Сумма массива: " + sum);

        } catch (MyArraySizeException e) {

            System.out.println("Ошибка размера массива:");
            System.out.println(e.getMessage());

        } catch (MyArrayDataException e) {

            System.out.println("Ошибка данных массива:");
            System.out.println(e.getMessage());
        }

        System.out.println();

        try {

            int[] numbers = new int[3];
            numbers[5] = 10;

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Поймано ArrayIndexOutOfBoundsException");
            System.out.println(e.getMessage());
        }
    }
    public static int sumArray(String[][] array)
            throws MyArraySizeException, MyArrayDataException {

        if (array.length != 4) {

            throw new MyArraySizeException(
                    "Размер массива должен быть 4x4"
            );
        }
        for (int i = 0; i < array.length; i++) {

            if (array[i].length != 4) {

                throw new MyArraySizeException(
                        "Размер массива должен быть 4x4"
                );
            }
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                try {

                    sum += Integer.parseInt(array[i][j]);

                } catch (NumberFormatException e) {

                    throw new MyArrayDataException(
                            "Неверные данные в ячейке: ["
                                    + i + "][" + j + "]"
                    );
               }
            }
        }
        return sum;
    }
}