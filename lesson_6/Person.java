package lesson_6;

/**
 * 1. ������� ����� "���������" � ������: ���, ���������, email, �������, ��������, �������.
 * ����������� ������ ������ ��������� ��� ���� ��� �������� �������.
 * ������ ������ ���������� �������� �����, ������� ������� ���������� �� ������� � �������.
 */
public class Person {
    public String name;
    public String position;
    public String email;
    public String phoneNumber;
    public long salary;
    public int age;

    public Person(String name, String position, String email, String phoneNumber, long salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "���: " + name +
                ", ���������: " + position +
                ", email: " + email +
                ", �������: " + phoneNumber +
                ", ��������: " + salary +
                ", �������: " + age + ";";
    }

    public void info() {
        System.out.println("���: " + name +
                ", ���������: " + position +
                ", email: " + email +
                ", �������: " + phoneNumber +
                ", ��������: " + salary +
                ", �������: " + age + ";");
    }
}