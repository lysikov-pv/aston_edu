package lesson_5;

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
     * @param a ������� ��������
     */
    public static void printNumberSign(int a) {
        System.out.println(a >= 0 ? "�������������" : "�������������");
    }

    /**
     * 7. �������� �����, �������� � �������� ��������� ���������� ����� �����. ����� ������ ������� true, ���� �����
     * �������������, � ������� false ���� �������������. ���������: ���� ������� ������������� ������.
     * @param a ������� ��������
     * @return a < 0 - true, �����  false
     */
    public static boolean isNegative(int a) {
        return a < 0;
    }

    /**
     * 8. �������� �����, �������� � �������� ���������� ���������� ������ � �����, ����� ������ ���������� � �������
     * ��������� ������, ��������� ���������� ���;
     * @param str ������
     * @param n ����� �������� ������
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
        printStrNTimes("������", 0);
    }
}
