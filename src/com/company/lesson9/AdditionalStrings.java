/*1. Задана строка с текстом на английском языке. Выделить все различные слова.
        Слова, отличающиеся только регистром букв, считать одинаковыми.
        Использовать класс HashSet.

2. Задана строка с текстом на английском языке. Выделить все различные слова.
        Для каждого слова подсчитать частоту его встречаемости. Слова, отличающиеся регистром букв, считать различными. Использовать класс HashMap.
3. Дано стихотворение в виде строки. Занести стихотворение в список (разделитель символ абзаца \n). Провести сортировку по возрастанию длин строк.*/


package com.company.lesson9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class AdditionalStrings {

    public HashSet<String> uniqueWordsHighlight(String englishString) {

        String[] stringParced = englishString.split(" ");
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < stringParced.length; i++) {
            String word = stringParced[i];
            String word1 = word.toLowerCase();
            hashSet.add(word1);
        }
        return hashSet;
    }

    public void printHashset(HashSet<String> hashSet) {
        for (String s : hashSet) {
            System.out.println(s);
        }
    }

//2. Задана строка с текстом на английском языке. Выделить все различные слова.
//Для каждого слова подсчитать частоту его встречаемости. Слова, отличающиеся регистром букв, считать различными. Использовать класс HashMap.

    public Map<String, Integer> uniqueWordsCountsDifRegister() {
        String englishString = "Для каждого слова подсчитать частоту его встречаемости. Слова, отличающиеся регистром букв, считать различными. Использовать класс HashMap";
        String[] stringParced = englishString.split("\\\\s*(\\\\s|,|!|\\\\.)\\\\s*");
        Map<String, Integer> hashmap = new HashMap<>();

        for (String s : stringParced) {

            if (hashmap.containsKey(s)) {
                hashmap.put(s, hashmap.get(s) + 1);
            } else {
                hashmap.put(s, 1);
            }
        }
        return hashmap;
    }


    //equals(): сравнивает строки с учетом регистра


}
