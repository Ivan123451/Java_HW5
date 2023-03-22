package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> employees = Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов");
        Map<String, Integer> nameFrequency = new HashMap<>();

        for (String employee : employees) {
            String name = employee.split(" ")[0];
            nameFrequency.put(name, nameFrequency.getOrDefault(name, 0)+1);

        }
        System.out.println(nameFrequency);

        List<Map.Entry<String, Integer>> sortedFrequency = new ArrayList<>(nameFrequency.entrySet());
        sortedFrequency.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        for (Map.Entry<String, Integer> entry : sortedFrequency) {
            System.out.printf("%s: %s%n", entry.getValue(), entry.getKey());
        }


    }
}