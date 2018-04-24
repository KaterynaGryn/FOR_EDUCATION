/*
Создать класс University с полями
Название (String),
Список студентов (ArrayList<Student>)
переопределить метод toString()
Создать методы для получения:
        a) списка студентов заданного факультета;
        b) списка студентов для каждого факультета и курса (этот пункт сложноват и неоднозначен. Предлагаю сделать так как вы его видете);
        c) списка студентов, родившихся после заданного года;
        d) списка учебной группы.
*/
package com.company.lesson3;

import java.util.ArrayList;

public class University {
    private String univercityName;
    private ArrayList<Student> studentArrayList = new ArrayList<Student>() {

    };

    public University(String univercityName) {
        this.univercityName = univercityName;
    }

    public String getUnivercityName() {
        return univercityName;
    }

    public void setUnivercityName(String univercityName) {
        this.univercityName = univercityName;
    }

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }

    public void setStudentArrayList(ArrayList<Student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }

    @Override

    public String toString() {
        return "University: " + this.univercityName + ":" + this.studentArrayList;
    }

    public ArrayList<Student> getStudentsListForFaculty(SimpleFaculties faculty) {
        ArrayList<Student> studentAtFacultyList = new ArrayList();
        for (Student student : studentArrayList) {
            if (student.getFaculty().equals(faculty))
                studentAtFacultyList.add(student);

        }
        return studentAtFacultyList;

    }

    public ArrayList<Student> getStudentsListForGroup(MediumGroups mediumGroup) {
        ArrayList<Student> studentAtGroupList = new ArrayList();
        for (Student student : studentArrayList) {
            if (student.getGroup().equals(mediumGroup))
                studentAtGroupList.add(student);

        }
        return studentAtGroupList;

    }

    public ArrayList<Student> getStudentsBornAfterDate(Long birthDate) {
        ArrayList<Student> lOut = new ArrayList();
        for (Student student : studentArrayList) {
            if (student.getBirthDate() >= birthDate)
                lOut.add(student);

        }
        return lOut;

    }

    public enum SimpleFaculties {

        FACULTY_OF_CHEMISTRY,
        FACULTY_OF_COMPUTER_SCIENCE_AND_CYBERNETICS,
        FACULTY_OF_ECONOMICS,
        FACULTY_OF_GEOGRAPHY,
        FACULTY_OF_HISTORY;
    }

    public enum MediumGroups {

        FIRST("Перша група"),
        SECOND("Друга група"),
        THIRD("Третя група"),
        FOURTH("Четверта група"),
        FIFTH("П'ята група");

        private final String nameUkr;
        MediumGroups(String nameUkr) {
            this.nameUkr = nameUkr;
        }

        @Override
        public String toString() {
            return nameUkr;
        }
    }

    public enum ComplicatedCourses {

        ONE("Первый курс", "Перший курс", 1, EducationalLevel.INCOMPLETEDHIGHEREDUCATION),
        TWO("Второй курс", "Другий курс", 2, EducationalLevel.BASICHIGHEREDUCATION),
        THREE("Третий курс", "Третій курс", 3, EducationalLevel.COMPLETEDHIGHEREDUCATION);

        private final String nameRu;
        private final String nameUa;
        private final int course;
        private final EducationalLevel educationalLevel;

        ComplicatedCourses(String nameRu, String nameUa, int course, EducationalLevel educationalLevel) {
            this.nameRu = nameRu;
            this.nameUa = nameUa;
            this.course = course;
            this.educationalLevel = educationalLevel;
        }

        @Override
        public String toString() {
            return nameRu;
        }

        private enum EducationalLevel {
            INCOMPLETEDHIGHEREDUCATION,
            BASICHIGHEREDUCATION,
            COMPLETEDHIGHEREDUCATION;
        }
    }


}


