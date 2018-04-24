////1. В каждом слове текста k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять.
////        2. Определить, сколько раз повторяется в тексте каждое слово, которое встречается в нем.
////        3. В тексте найти и напечатать n символов (и их количество), встречающихся наиболее часто.


package com.company.lesson8;

public class StringsWorks {

    String textString = "What’s your favoritef quote from a movie";


    //1. В каждом слове текста k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять.
    public void everyTextWordReplaceWith(int k, String newChar) {


//        int i = 0;
//        while (textString[i * number]) {
//
//            textString[i * number] = newChar;
//        }
//
        String[] stringParced = textString.split(" ");
        for (int i = 0; i < stringParced.length; i++) {
            String word = stringParced[i];
            if (word.length() >= k) {
                StringBuffer stringBuffer = new StringBuffer(word);
                word = stringBuffer.replace(k-1, k, newChar).toString();
                System.out.println(word);
            }
        }

//        String stringWithReplacements = textString.replace('W', symbol);

//        System.out.println(stringWithReplacements);
    }

//    //        2. Определить, сколько раз повторяется в тексте каждое слово, которое встречается в нем.

    String veryInterestingText = "For the first time in 35 years, Saudis are allowed to go to the cinema. But what did they watch?";
    public void howManyTimesWordExistsInText(String veryInterestingText) {
        String[] stringParced = textString.split(" ");
        for (int i = 0; i < stringParced.length; i++) {
            String word = stringParced[i];
        }
    }
//
//
//
// public void countWordsInText(String someText) {
//        int count = 0;
//        String words = sentence.split(' ');
//        for (i = 0; i < words.length; i++) {
//            word = words[i];
//            if (word == searchWord) {
//                count++
//            }
//        }
//
//    }
//
//    //        3. В тексте найти и напечатать n символов (и их количество), встречающихся наиболее часто.
//    public void quantityOfsymbolsUsedOften(String textString) {
//
//        result = {}
//        for (i = 0; i < text.length; i++) {
//            result[text[i]] = result[text[i]] || 0 + 1
//        }
//        max = {letter:'', count:''}
//        for (letter in result) {
//            if (result[letter] > max.count) {
//                max.letter = letter;
//                max.count = result.letter;
//            }
//        }
//
//    }

}
