package ua.zp.brainacad;
//1. Создать класс StringTest с main методом
//        2. Создать произвольные строки разными вариантами:
//        1) Литерал
//        2) new
//        3) массив символов
//        4) из байтов
//        5) С помощью StringBuilder
//        3. Работа с строкой
//        1) Создать строку “Апельсин,Яблоко,Гранат,Груша”.
//        2) Воспользоваться методом split для извлечения всех названий фруктов в массив.
//        3) Найти и вывести на экран самое длинное название фрукта с преобразованием
//        всех символов в нижний регистр.
//        4) Создать «сокращенный» вариант названия фрукта. Получить подстроку из
//        первых 3-х символов названия фрукта. Вывести на экран.
//        5) Создать строку “ Я_новая_строка ”. (с такими же пробелами)
//        6) Преобразовать строку: Убрать лишние пробелы в начале и конце
//        7) Преобразовать строку: заменить все символы ‘_’ на пробелы.
//        8) Вывести окончательный вариант на экран.
//        9) Создать Scanner для ввода текста. Выводим на экран сообщение с текстом: «Вы
//        ввели: <ваш текст>»
//        10) Добавить проверку: если введенный текст начинается со слова “Запуск”,
//        выводим на экран «Запускаем процесс»
//        11)Добавить проверку: если введенный текст заканчивается на слово “завершен”,
//        выводим на экран «Процесс завершен»
//        12)Добавить проверку: если введенный текст содержит слово “ошибка” (с любым
//        регистром букв), выводим на экран «Произошла ошибка»
//        4. Создать StringBuilder:
//        1) Добавить в него все ранее созданные строки.
//        2) После каждой 3-й строки выполнять перенос на новую строку.
//        3) Развернуть содержимое задом на перед.
//        4) Собрать StringBuilder в строку. Вывести ее на экран.
import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {

        char[] data = {'a', 'r', 'r', 'a', 'y'};
        StringBuilder builder = new StringBuilder("builder");
        String[] strings = {
                "literal",
                new String("constructor"),
                new String(data),
                new String("bytes".getBytes()),
                new String(builder)
        };

        for (String string : strings) {
            System.out.println(string);
        }

        String[] strings1 = "Апельсин,Яблоко,Гранат,Груша".split(",");
        int maxIndex = 0;
        int maxLength = 0;
        for (int i = 0; i < strings1.length; i++) {
            if (maxLength < strings1[i].length()) {
                maxLength = strings1[i].length();
                maxIndex = i;
            }
            System.out.println(strings1[i].substring(0, 3));
        }
        System.out.println(strings1[maxIndex].toLowerCase());

        String newString = " Я_новая_строка  ".strip().replace("_", " ");
        System.out.println(newString);

        System.out.println("\nВведите строку: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Вы ввели: " + text);
        if (text.startsWith("Запуск")) {
            System.out.println("Запускаем процесс");
        }
        if (text.endsWith("завершен")) {
            System.out.println("Процесс завершен");
        }
        if (text.toLowerCase().contains("ошибка")) {
            System.out.println("Произошла ошибка");
        }

        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (String string : strings) {
            stringBuilder.append(string + " ");
            if (++count % 3 == 0) {
                stringBuilder.append("\n");
            }
        }
        System.out.println(stringBuilder.reverse().toString());
    }
}
