package com.company;

import com.company.lesson1.CheckMonths;
import com.company.lesson2.Company;
import com.company.lesson2.Person;
import com.company.lesson3.Student;
import com.company.lesson3.University;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        CheckMonths checkMonths = new CheckMonths();
        Company company = new Company();
        company.numberOfStaff();
        String inputName = "Ivan";
        String inputSurname = "Ivan";
        System.out.println(String.format("Does Name %s exist in the Company? %s", inputName, company.ifNameOfColleagueExists(inputName)));
        System.out.println(String.format("Does such Surname exist in the Company? %s", company.IfSurnameNameOfColleagueExists(inputSurname)));

        Student student1 = new Student("Gryn", "Kateryna", "Sergiivna", 549900413L, "02091, Kyiv", "06373073073", 01L, "EP", "1", "1");
        Student student2 = new Student("Mclaren", "Igor", "Petrovych", 549900413L, "02192, Kyiv", "0672018855", 02L, "EP", "2", "1");
        Student student3 = new Student("Zabiyaka", "Maryna", "Petrivna", 549900413L, "01001, Kyiv", "0503513525", 03L, "EM", "3", "1");
        Student student4 = new Student("Havrylov", "Ivan", "Fedorovych", 549900413L, "09100, Bila Tserkva", "0678111518", 04L, "EM", "4", "1");
        Student student5 = new Student("Zoo", "Rio", "Ivanovna", 549900413L, "35200, Zhytomyr", "0672241316", 05L, "EP", "5", "1");

        ArrayList<Student> studentArrayList = new ArrayList();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);

        University university = new University("SHEVCHENKO");
        university.setStudentArrayList(studentArrayList);
        ArrayList<Student> getStudentsListForFaculty = university.getStudentsListForFaculty("EM");
        ArrayList<Student> getStudentsBornAfterDate = university.getStudentsBornAfterDate(549900413L);
        ArrayList<Student> getStudentsListForGroup = university.getStudentsListForGroup("1");
        String univercityName = university.getUnivercityName();
        System.out.println(getStudentsListForFaculty);
        System.out.println(getStudentsBornAfterDate);
        System.out.println(getStudentsListForGroup);
        System.out.println(univercityName);
    }
}
