package ua.zp.brainacad;

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
