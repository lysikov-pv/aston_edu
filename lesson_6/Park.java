package lesson_6;

/**
 * 3. ������� ����� Park � ���������� �������, � ������� �������� �������� ����� ������� ���������� �� ������������,
 * ������� �� ������ � ���������.
 */
public class Park {
    public String name;

    public Park(String name) {
        this.name = name;
    }

    public class Attraction {

        private String name;
        private String workingHours;
        private int price;

        public Attraction(String name, String workingHours, int price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        @Override
        public String toString() {
            return "��������: " + name +
                    ", �����: " + workingHours +
                    ", ���������: " + price + ';';
        }
    }
}