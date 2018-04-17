//Дана какая-то строка (задана переменной).
//        Задание 1: распечатать строку в обратном порядке
//        Задание 2: посчитать количество вхождений какого-то символа в строку (символ задается отдельной переменной)
//        Задание 3: посчитать количество уникальных символов (это задание может быть сложным и его можно сделать чуть позже)

package com.company.lesson7;


public class SomeString {

    String string1 = "I'm unbelievably available";

    //  метод, который распечатает строку в обратном порядке:
    public void printStringInReverse(String someString) {

        String reverse = new StringBuffer(someString).reverse().toString();
        System.out.println("String in reverse order: " + reverse);
    }

    //посчитать количество вхождений какого-то символа в строку (символ задается отдельной переменной)
    public void numberOfTimesSymbolOccurs(String letter) {

        int numberOfTimes = string1.split(letter).length - 1;
        System.out.println("numberOfTimes = " + numberOfTimes);
    }


    public void anotherMethodReverse(String someStringFourSymbs) {

        int count = someStringFourSymbs.length();
        char four = someStringFourSymbs.charAt(count - 1);
        char three = someStringFourSymbs.charAt(count - 2);
        char two = someStringFourSymbs.charAt(count - 3);
        char one = someStringFourSymbs.charAt(count - 4);
        System.out.println("String in reverse order: " + four + three + two + one);
    }

    public void anotherMethodReverse1(String someStringFourSymbs) {

        int count = someStringFourSymbs.length();
//        System.out.print("Єто йа: ");
        String sout = "";
        for (int i = count - 1; i >= 0; i--) {
            char c = someStringFourSymbs.charAt(i);
            sout = sout + c;
//            System.out.print(c);
        }
        System.out.print(String.format("Моя строка наоборот: '%s'.", sout));


    }

}
