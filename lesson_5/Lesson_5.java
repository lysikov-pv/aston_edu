package lesson_5;

import java.util.Arrays;

/**
 * ASTON "QA Engineer Java" 6-7 поток
 * Практическое задание Л5
 */
public class Lesson_5 {

    /**
     * 1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange,
     * Banana, Apple.
     */
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    /**
     * 2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их
     * любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма
     * больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма
     * отрицательная”;
     */
    public static void checkSumSign() {
        int a = 0;
        int b = 0;
        System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    /**
     * 3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым
     * значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если
     * лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100
     * (100 исключительно) - “Зеленый”;
     */
    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    /**
     * 4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их
     * любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение
     * “a >= b”, в противном случае “a < b”;
     */
    public static void compareNumbers() {
        int a = -1;
        int b = 2;
        System.out.println(a >= b ? "a >= b" : "a < b");

    }

    /**
     * 5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
     * (включительно), если да – вернуть true, в противном случае – false.
     *
     * @param a первый параметр
     * @param b второй параметр
     * @return если 10 <= a + b <= 20 – true, в противном случае – false
     */
    public static boolean checkSumInterval(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    /**
     * 6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     * положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     *
     * @param a входной параметр
     */
    public static void printNumberSign(int a) {
        System.out.println(a >= 0 ? "Положительное" : "Отрицательное");
    }

    /**
     * 7. Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
     * отрицательное, и вернуть false если положительное. Замечание: ноль считаем положительным числом.
     *
     * @param a входной параметр
     * @return a < 0 - true, иначе  false
     */
    public static boolean isNegative(int a) {
        return a < 0;
    }

    /**
     * 8. Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
     * указанную строку, указанное количество раз;
     *
     * @param str строка
     * @param n   число повторов строки
     */
    public static void printStrNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    /**
     * 9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не
     * високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
     * високосный.
     *
     * @param year
     * @return true - високосный, false - не високосный
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    /**
     * 10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С
     * помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void invertBoolArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Вход: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println("Выход: " + Arrays.toString(arr));
    }

    /**
     * 11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
     * значениями 1 2 3 4 5 6 7 8 ... 100;
     */
    public static void initArray100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static void transformArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Вход: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
        }
        System.out.println("Выход: " + Arrays.toString(arr));
    }

    /**
     * 13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
     * цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть
     * [0][0], [1][1], [2][2], ..., [n][n];
     */
    public static void fillArrayDiags() {
        int arrSize = 7;
        int[][] arr = new int[arrSize][arrSize];
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                if (i == j || j == arrSize - i - 1) arr[i][j] = 1;
                else arr[i][j] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    /**
     * 14. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа
     * int длиной len, каждая ячейка которого равна initialValue.
     *
     * @param len          длина массива
     * @param initialValue значения которыми инициализируется массив
     * @return одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
     */
    public static int[] returnArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void main(String[] args) {
        // printThreeWords();
        // checkSumSign();
        // printColor();
        // compareNumbers();
        // System.out.println(checkSumInterval(-1, 22));
        // printNumberSign(0);
        // System.out.println(isNegative(0));
        // printStrNTimes("Строка", 0);
        // System.out.println(isLeapYear(2000));
        // invertBoolArray();
        // initArray100();
        // transformArray();
        // fillArrayDiags();
        System.out.println(Arrays.toString(returnArray(10, -1)));
    }
}