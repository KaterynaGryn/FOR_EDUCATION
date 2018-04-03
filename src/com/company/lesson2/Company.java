package com.company.lesson2;

//"Задание 2:
// -----------ЗАДАНИЕ НА СЛЕДУЮЩЕЕ ЗАНЯТИЕ--------------------------------------------------
// - Создать класс Company с полями companyName, и списком сотрудников (это будет лист класса Person состоящий из например 5 предефайнутых (предопределенных) сотрудников)
// - В классе Company создать метод который будет возвращать количество сотрудников;
// - В классе Company создать метод который будет возвращать есть ли сотрудник с данным именем
// - В классе Company создать метод который будет возвращать есть ли сотрудник с данной фамилией;"


import java.util.ArrayList;


public class Company {

    public String companyName;
    public ArrayList<Person> personStaff = new ArrayList<Person>() {{
        add(new Person("Rich", "Boleck"));
        add(new Person("Kate", "Gryn"));
        add(new Person("Ivan", "Paraman"));
        add(new Person("Evgeniy", "Gryn"));
        add(new Person("Darwin", "Gryn"));
    }};


    public int numberOfStaff() {
        System.out.println(String.format("In our Company currently work %s colleagues", personStaff.size()));
        return personStaff.size();
    }

    public void setPersonStaff() {
        ArrayList<Person> personStaff = new ArrayList<>();
        Person person1 = new Person();
        person1.setFirstName("Chanakya");
        person1.setLastName("Adibhatla");
        personStaff.add(person1);
    }

    public boolean ifNameOfColleagueExists(String name) {
        for (Person person : personStaff) {
            if (person.getFirstName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public boolean IfSurnameNameOfColleagueExists(String surname) {

        for (Person person : personStaff) {
            if (person.getLastName().equals(surname)) {
                return true;
            }

        }
        return false;
    }
}
