package lesson_8;

public class Array4x4 {
    /**
     * Возвращает сумму элемегтов массива 4х4
     *
     * @param arr массив целых чисел 4х4
     * @return Сумму элементов массива
     * @throws MyArraySizeException если размер не 4х4
     * @throws MyArrayDataException если в элемениах не только int
     */
    public static int sum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4)
            throw new MyArraySizeException("Массив не 4x4: " + arr.length + "x" + arr[0].length);
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В ячейке [" + i + "," + j + "] не целое число:  \'" + arr[i][j] + "\'");
                }
            }
        }
        return result;
    }

    public static Integer sumWithInnerErrPrint(String[][] arr) {
        try {
            if (arr.length != 4 || arr[0].length != 4)
                throw new MyArraySizeException("Массив не 4x4: " + arr.length + "x" + arr[0].length);
        } catch (MyArraySizeException e) {
            System.err.println(e);
        }
        int result = 0;
        boolean dataException = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    try {
                        result += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        dataException = true;
                        throw new MyArrayDataException("В ячейке [" + i + "," + j + "] не целое число:  \'" + arr[i][j] + "\'");
                    }
                } catch (MyArrayDataException e) {
                    System.err.println(e);
                }
            }
        }
        return dataException ? null : result;
    }
}