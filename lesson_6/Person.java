package lesson_6;

/**
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * Конструктор класса должен заполнять эти поля при создании объекта.
 * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
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
        return "ФИО: " + name +
                ", Должность: " + position +
                ", email: " + email +
                ", телефон: " + phoneNumber +
                ", зарплата: " + salary +
                ", возраст: " + age + ";";
    }

    public void info() {
        System.out.println("ФИО: " + name +
                ", Должность: " + position +
                ", email: " + email +
                ", телефон: " + phoneNumber +
                ", зарплата: " + salary +
                ", возраст: " + age + ";");
    }
}