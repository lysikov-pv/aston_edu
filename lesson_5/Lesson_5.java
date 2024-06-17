package lesson_5;

import java.util.Arrays;

/**
 * ASTON "QA Engineer Java" 6-7 �����
 * ������������ ������� �5
 */
public class Lesson_5 {

    /**
     * 1. �������� ����� printThreeWords(), ������� ��� ������ ������ ���������� � ������� ��� �����: Orange,
     * Banana, Apple.
     */
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    /**
     * 2. �������� ����� checkSumSign(), � ���� �������� �������� ��� int ���������� a � b, � ��������������� ��
     * ������ ����������, �������� ��������. ����� ����� ������ �������������� ��� ����������, � ���� �� �����
     * ������ ��� ����� 0, �� ������� � ������� ��������� ������ ��������������, � ��������� ������ - ������
     * ��������������;
     */
    public static void checkSumSign() {
        int a = 0;
        int b = 0;
        System.out.println(a + b >= 0 ? "����� �������������" : "����� �������������");
    }

    /**
     * 3. �������� ����� printColor() � ���� �������� ������� int ���������� value � ��������������� �� �����
     * ���������. ���� value ������ 0 (0 ������������), �� � ������� ����� ������ ������� ��������� ��������, ����
     * ����� � �������� �� 0 (0 �������������) �� 100 (100 ������������), �� �������, ���� ������ 100
     * (100 �������������) - ��������;
     */
    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("�������");
        } else if (value > 0 && value <= 100) {
            System.out.println("������");
        } else {
            System.out.println("�������");
        }
    }

    /**
     * 4. �������� ����� compareNumbers(), � ���� �������� �������� ��� int ���������� a � b, � ��������������� ��
     * ������ ����������, �������� ��������. ���� a ������ ��� ����� b, �� ���������� ������� � ������� ���������
     * �a >= b�, � ��������� ������ �a < b�;
     */
    public static void compareNumbers() {
        int a = -1;
        int b = 2;
        System.out.println(a >= b ? "a >= b" : "a < b");

    }

    /**
     * 5. �������� �����, ����������� �� ���� ��� ����� ����� � �����������, ��� �� ����� ����� � �������� �� 10 �� 20
     * (������������), ���� �� � ������� true, � ��������� ������ � false.
     *
     * @param a ������ ��������
     * @param b ������ ��������
     * @return ���� 10 <= a + b <= 20 � true, � ��������� ������ � false
     */
    public static boolean checkSumInterval(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    /**
     * 6. �������� �����, �������� � �������� ��������� ���������� ����� �����, ����� ������ ���������� � �������,
     * ������������� �� ����� �������� ��� �������������. ���������: ���� ������� ������������� ������.
     *
     * @param a ������� ��������
     */
    public static void printNumberSign(int a) {
        System.out.println(a >= 0 ? "�������������" : "�������������");
    }

    /**
     * 7. �������� �����, �������� � �������� ��������� ���������� ����� �����. ����� ������ ������� true, ���� �����
     * �������������, � ������� false ���� �������������. ���������: ���� ������� ������������� ������.
     *
     * @param a ������� ��������
     * @return a < 0 - true, �����  false
     */
    public static boolean isNegative(int a) {
        return a < 0;
    }

    /**
     * 8. �������� �����, �������� � �������� ���������� ���������� ������ � �����, ����� ������ ���������� � �������
     * ��������� ������, ��������� ���������� ���;
     *
     * @param str ������
     * @param n   ����� �������� ������
     */
    public static void printStrNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    /**
     * 9. �������� �����, ������� ����������, �������� �� ��� ����������, � ���������� boolean (���������� - true, ��
     * ���������� - false). ������ 4-� ��� �������� ����������, ����� ������� 100-��, ��� ���� ������ 400-� �
     * ����������.
     *
     * @param year
     * @return true - ����������, false - �� ����������
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    /**
     * 10. ������ ������������� ������, ��������� �� ��������� 0 � 1. ��������: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. �
     * ������� ����� � ������� �������� 0 �� 1, 1 �� 0;
     */
    public static void invertBoolArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("����: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println("�����: " + Arrays.toString(arr));
    }

    /**
     * 11. ������ ������ ������������� ������ ������ 100. � ������� ����� ��������� ���
     * ���������� 1 2 3 4 5 6 7 8 ... 100;
     */
    public static void initArray100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 12. ������ ������ [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] ������ �� ���� ������, � ����� ������� 6 �������� �� 2;
     */
    public static void transformArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("����: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
        }
        System.out.println("�����: " + Arrays.toString(arr));
    }

    /**
     * 13. ������� ���������� ��������� ������������� ������ (���������� ����� � �������� ����������), � � �������
     * �����(-��) ��������� ��� ������������ �������� ��������� (����� ������ ���� �� ����������, ���� ��� ������).
     * ���������� �������� ����� �� ���������� ����� �� ���������� ��������: ������� ����� ��������� �����, �� ����
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
     * 14. �������� �����, ����������� �� ���� ��� ���������: len � initialValue, � ������������ ���������� ������ ����
     * int ������ len, ������ ������ �������� ����� initialValue.
     *
     * @param len          ����� �������
     * @param initialValue �������� �������� ���������������� ������
     * @return ���������� ������ ���� int ������ len, ������ ������ �������� ����� initialValue
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
        // printStrNTimes("������", 0);
        // System.out.println(isLeapYear(2000));
        // invertBoolArray();
        // initArray100();
        // transformArray();
        // fillArrayDiags();
        System.out.println(Arrays.toString(returnArray(10, -1)));
    }
}