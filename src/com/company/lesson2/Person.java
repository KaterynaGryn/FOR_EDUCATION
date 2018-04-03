package com.company.lesson2;
//"Задание 2:
// - переделать структуру проекта с использованием пакаджей
// - на каждое занятие создаем свой пакадж с именем Lesson*
//            - внутри пакаджа классы называем именем близким к смыслу того для чего нужен класс (не знаю как сформулировать короче. Есть вопросы спрашивайте)
// -----------ЗАДАНИЕ НА СЛЕДУЮЩЕЕ ЗАНЯТИЕ--------------------------------------------------
//            - Создать класс Person с полями firstName, lastName
// - Создать геттеры и сеттеры для каждого поля
// - Создать класс Company с полями companyName, и списком сотрудников (это будет лист класса Person состоящий из например 5 предефайнутых (предопределенных) сотрудников)
//            - В классе Company создать метод который будет возвращать количество сотрудников;
// - В классе Company создать метод который будет возвращать есть ли сотрудник с данным именем
// - В классе Company создать метод который будет возвращать есть ли сотрудник с данной фамилией;"


public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstN, String lastN) {
        this.firstName = firstN;
        this.lastName = lastN;
    }

    public Person() {

    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}

