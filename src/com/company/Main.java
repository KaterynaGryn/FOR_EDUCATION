package com.company;

import com.company.lesson1.CheckMonths;
import com.company.lesson10.Lesson10;
import com.company.lesson2.Company;
import com.company.lesson3.Student;
import com.company.lesson3.University;
import com.company.lesson4.SimpleEnum;
import com.company.lesson7.SomeString;
import com.company.lesson8.StringsWorks;
import com.company.lesson9.AdditionalStrings;
import com.company.lesson9.DifCollections;
import com.company.myAdditionalWork.MakingDecisionsStatements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static com.company.lesson3.University.MediumGroups.FIRST;
import static com.company.lesson3.University.SimpleFaculties.FACULTY_OF_CHEMISTRY;

public class Main {

    public static void lesson1() {
        CheckMonths checkMonths = new CheckMonths();
        Company company = new Company();
        company.numberOfStaff();
        String inputName = "Ivan";
        String inputSurname = "Ivan";
        System.out.println(String.format("Does Name %s exist in the Company? %s", inputName, company.ifNameOfColleagueExists(inputName)));
        System.out.println(String.format("Does such Surname exist in the Company? %s", company.IfSurnameNameOfColleagueExists(inputSurname)));
    }

    public static void lesson2() {


    }

    public static void lesson3() {

//<editor-fold desc="University">
        Student student1 = new Student("Gryn", "Kateryna", "Sergiivna", 549900413L, "02091, Kyiv", "06373073073", 01L, "EP", "1", "1");
        Student student2 = new Student("Mclaren", "Igor", "Petrovych", 549900413L, "02192, Kyiv", "0672018855", 02L, "EP", "2", "1");
        Student student3 = new Student("Zabiyaka", "Maryna", "Petrivna", 549900413L, "01001, Kyiv", "0503513525", 03L, "EM", "3", "1");
        Student student4 = new Student("Havrylov", "Ivan", "Fedorovych", 549900413L, "09100, Bila Tserkva", "0678111518", 04L, "EM", "4", "1");
        Student student5 = new Student("Zoo", "Rita", "Ivanovna", 549900413L, "35200, Zhytomyr", "0672241316", 05L, "EP", "5", "1");

        ArrayList<Student> studentArrayList = new ArrayList();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);

        University university = new University("SHEVCHENKO");
        university.setStudentArrayList(studentArrayList);
        ArrayList<Student> getStudentsListForFaculty = university.getStudentsListForFaculty(FACULTY_OF_CHEMISTRY);
        ArrayList<Student> getStudentsBornAfterDate = university.getStudentsBornAfterDate(549900413L);
        ArrayList<Student> getStudentsListForGroup = university.getStudentsListForGroup(FIRST);
        String univercityName = university.getUnivercityName();
        System.out.println(getStudentsListForFaculty);
        System.out.println(getStudentsBornAfterDate);
        System.out.println(getStudentsListForGroup);
        System.out.println(univercityName);
//</editor-fold>
    }

    public static void lesson4() {


        SimpleEnum month = SimpleEnum.APRIL;

        switch (month) {

            case JANUARY:
                break;
            case FEBRUARY:
                break;
            case MARCH:
                break;
            case APRIL:
                break;
            case MAY:
                break;
            case JUNE:
                break;
            case JULY:
                break;
            case AUGUST:
                break;
            case SEPTEMBER:
                break;
            case OCTOBER:
                break;
            case NOVEMBER:
                break;
            case DECEMBER:
                break;


            // MediumEnum monthMed = MediumEnum.AUGUST;
            // System.out.println(monthMed);
            //  System.out.println(monthMed.name());
        }
    }

    public static void lesson5() {
    }

    public static void lesson6() {
    }

    public static void lesson7() {
        SomeString someString = new SomeString();
        someString.printStringInReverse("I'm unbeliveably available");
        someString.printStringInReverse("Лев с ума ламу свёл");
        someString.numberOfTimesSymbolOccurs("I");
        someString.anotherMethodReverse("JAVA");
        someString.anotherMethodReverse1("JAVA1");
    }

    public static void lesson8() {


        StringsWorks stringsWorks = new StringsWorks();

        stringsWorks.everyTextWordReplaceWith(1, "K");
    }

    public static void myAdditionalWork() {
//        Car mazdaCar = new Car();
//        mazdaCar.start();
//        mazdaCar.drive(60);
//        mazdaCar.stop();
//        JamesBondCar jamesBondCar = new JamesBondCar();
//        jamesBondCar.start();
//        jamesBondCar.drive(60);
//        System.out.println();
//        jamesBondCar.stop();
//        TemperatureConverter temperatureConverter = new TemperatureConverter();
//        temperatureConverter.convertTemp(20,'F');
//        temperatureConverter.convertTemp(68,'C');
//        temperatureConverter.convertTemp(540,'X');
        MakingDecisionsStatements makingDecisionsStatements = new MakingDecisionsStatements();
        makingDecisionsStatements.currencyConverterForMyTrip(26.21);
        makingDecisionsStatements.whatToWearToday(2);
    }

    public static void lesson9() {

        DifCollections difCollections = new DifCollections();
        AdditionalStrings additionalStrings = new AdditionalStrings();
        HashSet<String> uniqueSet = additionalStrings.uniqueWordsHighlight("Text is my super puper text text text");
        additionalStrings.printHashset(uniqueSet);
    }

    public static void lesson10() {

        Lesson10 lesson10 = new Lesson10();
        lesson10.readPropFile();
        System.out.println(lesson10.readPropFile().getProperty("property3"));
        List<String> list = lesson10.readFileAsList();


 //       lesson10.writeToFile("list");
    }
    public static void main(String[] args) {

//        lesson1();
//        lesson2();
//    lesson3();
//        lesson4();
//        lesson5();
//        lesson6();
//        lesson7();
        //      lesson8();
        //myAdditionalWork();
  lesson9();
       // lesson10();

    }
}


