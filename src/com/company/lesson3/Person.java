/*Создать класс Person:
Фамилия (String),
Имя (String),
Отчество (String),
Дата рождения (Long. Почитать про Epoch),
Адрес (String),
Телефон (String).
переопределить метод toString()*/

package com.company.lesson3;

public class Person {
    private String surname;
    private String name;
    private String patronymic;
    private Long birthDate;
    private String adress;
    private String phoneNumb;

    public Person(String surname, String name, String patronymic, Long birthDate, String adress, String phoneNumb) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.adress = adress;
        this.phoneNumb = phoneNumb;

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Long birthDate) {
        this.birthDate = birthDate;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public void setPhoneNumb(String phoneNumb) {
        this.phoneNumb = phoneNumb;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthDate=" + birthDate +
                ", adress='" + adress + '\'' +
                ", phoneNumb='" + phoneNumb + '\'' +
                '}';
    }
}
