package lesson_6;

/**
 * ASTON "QA Engineer Java" 6-7 �����
 * ������������ ������� �6
 */
public class Lesson_6 {

    public static void main(String[] args) {
        /**
         * 1. ������� ����� "���������" � ������: ���, ���������, email, �������, ��������, �������.
         * ����������� ������ ������ ��������� ��� ���� ��� �������� �������.
         * ������ ������ ���������� �������� �����, ������� ������� ���������� �� ������� � �������.
         * 2. ������� ������ �� 5 �����������.
         */

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "QA Engineer", "i.ivanov@mailbox.com", "89231231213", 30000L, 30);
        persArray[1] = new Person("Petrov Alexander", "Programmer", "a.petrov@mailbox.com", "89231231214", 50000L, 28);
        persArray[2] = new Person("Sidorov Oleg", "SEO", "o.sidorov@mailbox.com", "89231231215", 100000L, 40);
        persArray[3] = new Person("Ivanov Platon", "Product Manager", "p.ivanov@mailbox.com", "89231231216", 80000L, 38);
        persArray[4] = new Person("Starcev Nikolay", "Programmer", "n.starcev@mailbox.com", "89231231217", 50000L, 32);

        for (Person pers : persArray) {
            pers.info();
            // System.out.println(pers); // � ������� �������������� toString()
        }

        /**
         * 3. ������� ����� Park � ���������� �������, � ������� �������� �������� ����� ������� ���������� ��
         * ������������, ������� �� ������ � ���������.
         */
        Park gagarin = new Park("�������");
        Park.Attraction[] gagarinAttractions = new Park.Attraction[3];
        gagarinAttractions[0] = gagarin.new Attraction("������", "10:00-20:00", 100);
        gagarinAttractions[1] = gagarin.new Attraction("���", "12:00-20:00", 150);
        gagarinAttractions[2] = gagarin.new Attraction("������", "10:00-18:00", 200);
        for (Park.Attraction attraction : gagarinAttractions) {
            System.out.println(attraction);
        }
    }
}