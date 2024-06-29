package lesson_8;

/**
 * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого
 * размера необходимо бросить исключение MyArraySizeException.
 * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то
 * элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть
 * брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
 * 3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и
 * MyArrayDataException и вывести результат расчета.
 */
public class Lesson_8 {
    public static int sumArray4x4Cells(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4)
            throw new MyArraySizeException("Массив не 4x4: " + arr.length + "x" + arr[0].length);
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В ячейке не целое число: [" + i + "," + j + "] = \'" + arr[i][j] + "\'");
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        // String[][] arr = {{"1","2","3","4"}, {"1","2","3","4"}, {"1","2","3","4"}, {"-1","-2","-3","-4"}};   // сумма 20
        // String[][] arr = {{"5","7","3","17"}, {"7","0","1","12"}, {"8","1","2","3"}};                        // MyArraySizeException
        String[][] arr = {{"1",null,"3","4"}, {"1","@","3","4"}, {"1","2","3","4"}, {"-1","-2","-3","-4"}};     // MyArrayDataException
        try {
            System.out.println("Сумма элементов массива: " + sumArray4x4Cells(arr));
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}