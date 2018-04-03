/*
Класс Student унаследовать от класса Person:
id (Long. По возможности использовать класс Random. Если нет то в ручную),
Факультет (String),
Курс (String),
Группа (String).
переопределить метод toString()*/

package com.company.lesson3;

public class Student extends Person {
private Long id;
private String faculty;
private String course;
private String group;


    public Student(String surname, String name, String patronymic, Long birthDate, String adress, String phoneNumb, Long id, String faculty, String course, String group) {
        super(surname, name, patronymic, birthDate, adress, phoneNumb);
        this.id = id;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", faculty='" + faculty + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                "} " + super.toString();
    }
}
