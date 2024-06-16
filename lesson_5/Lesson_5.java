package lesson_5;

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
     * @param a входной параметр
     */
    public static void printNumberSign(int a) {
        System.out.println(a >= 0 ? "Положительное" : "Отрицательное");
    }

    /**
     * 7. Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
     * отрицательное, и вернуть false если положительное. Замечание: ноль считаем положительным числом.
     * @param a входной параметр
     * @return a < 0 - true, иначе  false
     */
    public static boolean isNegative(int a) {
        return a < 0;
    }

    /**
     * 8. Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
     * указанную строку, указанное количество раз;
     * @param str строка
     * @param n число повторов строки
     */
    public static void printStrNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        /*
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkSumInterval(-1, 22));
        printNumberSign(0);
        System.out.println(isNegative(0)); */
        printStrNTimes("Строка", 0);
    }
}
