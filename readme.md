# ASTON "QA Engineer Java" 6-7 поток
## Практическое задание 4
Сразу оговоримся, в каком виде это будет происходить.

__Во-первых__, необходимо создать себе аккаунт на GitHub (если у вас его нет).

__Во-вторых__, создать себе репозиторий, в который вы будете складывать выполненные домашние задания.

__В-третьих__, сразу договоримся, что для каждого урока вам необходимо будет создавать отдельную ветку с названием вида “Lesson_1” (если иное не указано в условии).

__В-четвёртых__, условимся, что будем использовать Java версии 11.

К данному заданию прикрепите ссылку на ваш GitHub.

## Практическое задание 5
1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
7. Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное. Замечание: ноль считаем положительным числом.
8. Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: \[ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
12. Задать массив \[ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть \[0]\[0], \[1]\[1], \[2]\[2], ..., \[n]\[n];
14. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.

Методы из пунктов 1-14 вызовите из метода main() и посмотрите корректно ли они работают.

## Практическое задание 6
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.  
   Конструктор класса должен заполнять эти поля при создании объекта.  
   Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.


2. Создать массив из 5 сотрудников. Пример:
   ```
   // вначале объявляем массив объектов
   Person[] persArray = new Person[5];
   // потом для каждой ячейки массива задаем объект
   persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
   persArray[1] = new Person(...);
   // ...persArray[4] = new Person(...);
   ```

3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.

## Практическое задание 7
__Задание 1:__

Создать классы Собака и Кот с наследованием от класса Животное.

Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');

У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).

Добавить подсчет созданных котов, собак и животных.

Расширить задачу, добавив для котов возможность кушать из миски, выполнив следующие пункты:
Сделать так, чтобы в миске с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
Считаем, что если коту мало еды в миске, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
Создать массив котов и миску с едой, попросить всех котов покушать из этой миски и потом вывести информацию о сытости котов в консоль.
Добавить метод, с помощью которого можно было бы добавлять еду в миску.


__Задание 2:__

Применяя интерфейсы написать программу расчета периметра и площади геометрических фигур: круг, прямоугольник, треугольник.
Задать для каждой фигуры цвет заливки и цвет границы.
Результат полученных характеристик [ Периметр, площадь, цвет фона, цвет границ ] по каждой фигуре вывести в консоль.


Попробуйте реализовать базовые методы, такие как расчет периметра фигур, в качестве дефолтных методов в интерфейсе.

## Практическое задание 8
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.

## Практическое задание 9
1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово. (реализовать с использованием коллекций)

2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

## Практическое задание 10
Создайте 2 ветки: Lesson_10_junit_5 и Lesson_10_testng.

Напишите программу, позволяющую вычислить факториал числа. Эта программа должна быть в каждой ветке.

В ветке Lesson_10_junit_5 напишите юнит-тесты для этой программы, используя Junit 5.
В ветке Lesson_10_testng  напишите юнит-тесты, используя TestNG.

## Практическое задание 13
Необходимо написать автотесты для сайта mts.by - http://mts.by  . Суть тестов заключается в проверке блока «Онлайн пополнение без комиссии»:
1. Проверить название указанного блока;
2. Проверить наличие логотипов платёжных систем;
3. Проверить работу ссылки «Подробнее о сервисе»;
4. Заполнить поля и проверить работу кнопки «Продолжить» (проверяем только вариант «Услуги связи», номер для теста 297777777)

## Практическое задание 14
Продолжим работу над блоком «Онлайн пополнение без комиссии» сайта mts.by.
1. Проверить надписи в незаполненных полях каждого варианта оплаты услуг: услуги связи, домашний интернет, рассрочка, задолженность;
2. Для варианта «Услуги связи» заполнить поля в соответствии с пререквизитами из предыдущей темы, нажать кнопку «Продолжить» и в появившемся окне проверить корректность отображения суммы (в том числе на кнопке), номера телефона, а также надписей в незаполненных полях для ввода реквизитов карты, наличие иконок платёжных систем.

## Практическое задание 18
Взять тест из задания 14 и добавить Allure-репорт 