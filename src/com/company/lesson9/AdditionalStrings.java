/*1. Задана строка с текстом на английском языке. Выделить все различные слова.
        Слова, отличающиеся только регистром букв, считать одинаковыми.
        Использовать класс HashSet.

2. Задана строка с текстом на английском языке. Выделить все различные слова.
        Для каждого слова подсчитать частоту его встречаемости. Слова, отличающиеся регистром букв, считать различными. Использовать класс HashMap.
3. Дано стихотворение в виде строки. Занести стихотворение в список (разделитель символ абзаца \n). Провести сортировку по возрастанию длин строк.*/


package com.company.lesson9;

import java.util.HashSet;

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


    //equals(): сравнивает строки с учетом регистра


}
