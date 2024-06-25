package lesson_6;

/**
 * ASTON "QA Engineer Java" 6-7 поток
 * Практическое задание Л6
 */
public class Lesson_6 {

    public static void main(String[] args) {
        /**
         * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
         * Конструктор класса должен заполнять эти поля при создании объекта.
         * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
         * 2. Создать массив из 5 сотрудников.
         */

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "QA Engineer", "i.ivanov@mailbox.com", "89231231213", 30000L, 30);
        persArray[1] = new Person("Petrov Alexander", "Programmer", "a.petrov@mailbox.com", "89231231214", 50000L, 28);
        persArray[2] = new Person("Sidorov Oleg", "SEO", "o.sidorov@mailbox.com", "89231231215", 100000L, 40);
        persArray[3] = new Person("Ivanov Platon", "Product Manager", "p.ivanov@mailbox.com", "89231231216", 80000L, 38);
        persArray[4] = new Person("Starcev Nikolay", "Programmer", "n.starcev@mailbox.com", "89231231217", 50000L, 32);

        for (Person pers : persArray) {
            pers.info();
            // System.out.println(pers); // С помощью перегруженного toString()
        }

        /**
         * 3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об
         * аттракционах, времени их работы и стоимости.
         */
        Park gagarin = new Park("Гагарин");
        Park.Attraction[] gagarinAttractions = new Park.Attraction[3];
        gagarinAttractions[0] = gagarin.new Attraction("Космос", "10:00-20:00", 100);
        gagarinAttractions[1] = gagarin.new Attraction("Тир", "12:00-20:00", 150);
        gagarinAttractions[2] = gagarin.new Attraction("Лебеди", "10:00-18:00", 200);
        for (Park.Attraction attraction : gagarinAttractions) {
            System.out.println(attraction);
        }
    }
}