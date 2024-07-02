package lesson_9;

import java.util.*;

/**
 * 2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать
 * номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае
 * однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 */
public class Phonebook {
    public static Map<String, ArrayList<String>> phonebook = new HashMap<>();

    public static void add(String name, String phone) {
        String nameKey = name.toLowerCase();
        if (phonebook.containsKey(nameKey)) {
            phonebook.get(nameKey).add(phone);
        } else {
            phonebook.put(nameKey, new ArrayList<String>(Arrays.asList(phone)));
        }
    }

    public static void get(String name) {
        ArrayList<String> entry = phonebook.get(name.toLowerCase());
        if (entry != null) {
            System.out.println("По строке \'" + name + "\' нашлись телефоны: " + entry.toString());
        } else {
            System.out.println("По строке \'" + name + "\' записей нет");
        }
    }
}
