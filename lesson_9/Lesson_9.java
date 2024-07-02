package lesson_9;

import java.util.HashMap;
import java.util.Map;

public class Lesson_9 {
    public static void main(String[] args) {
        /**
         * 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список
         * уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое
         * слово. (реализовать с использованием коллекций)
         */
        String[] inputWords = {"дом", "стул", "стол", "книга", "ручка", "дом", "стена", "ковер", "книга", "окно", "стул", "дом", "ковер", "стена", "окно"};
        Map<String, Integer> freqMap = new HashMap<>(createFreqMap(inputWords));

        // System.out.println(freqMap);
        System.out.print("Список уникальных слов: ");
        freqMap.forEach((k, v) -> System.out.print("\'" + k + "\' "));
        System.out.println();

        freqMap.forEach((k, v) -> System.out.println("Слово: \'" + k + "\' Повторений: " + v));

        /**
         * 2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
         * В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать
         * номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае
         * однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
         */
        Phonebook.add("Ivanov", "+7123456");
        Phonebook.add("Petrov", "+7567890");
        Phonebook.add("Ivanov", "+7654321");
        Phonebook.get("ivanov");
        Phonebook.get("sidorov");
    }

    public static Map<String, Integer> createFreqMap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String key : strings) {
            Integer count = map.getOrDefault(key, 0);
            map.put(key, count + 1);
        }
        return map;
    }
}