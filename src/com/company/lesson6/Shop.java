package com.company.lesson6;

import java.util.ArrayList;

public class Shop {

    String shopName = "BookStore";
    public ArrayList<Book> bookArrayList = new ArrayList<Book>() {{
        add(new Book("WAR_AND_PEACE ", "LEO TOLSTOY", 1867L, 1225, 100, "SADDLE_STITCHING"));
        add(new Book("DUNNO ON THE MOON", "NYKOLAY NOSOV", 1965L, 448, 60, "COPTIC_BINDING"));
        add(new Book("PETER THE FIRST", "ALEKSEY TOLSTOY", 1930L, 752, 150, "SECTION_SEWN"));
        add(new Book("EAT, PRAY, LOVE", "ELYZABETH GILBERT", 2015L, 368, 200, "SADDLE_STITCHING"));
    }};

    //    public void setPersonStaff() {
//        ArrayList<Person> personStaff = new ArrayList<>();
//        Person person1 = new Person();
//        person1.setFirstName("Chanakya");
//        person1.setLastName("Adibhatla");
//        personStaff.add(person1);
//    }
    public void removeOneBook() {
        ArrayList<Book> bookArrayList = new ArrayList<>();
        if bookName = new.bookName and author = new.author
        then
        bookArrayList.remove(1);
    }
    public void addNewBook(){
        ArrayList<Book> bookArrayList = new ArrayList<>();
        Book book1 = new Book();
        book1.setAuthor();
        book1.setBookName();
        book1.setYearOfpublishing();
        book1.setNumberOfPages();
        book1.setPrice();
        book1.setTypeOfbindingSimpleEnum(typeOfbindingSimpleEnum.SADDLE_STITCHING);
    }

    public void printBookSpecifiedAuthor(){
        ArrayList<Book> bookArrayList = new ArrayList<>();
        if author = new.author
                then
        bookArrayList.add(book);
        System.out.println(bookArrayList);
    }

    public void printBookSpecifiedInterval(){
        ArrayList<Book> bookArrayList = new ArrayList<>();
        if year >1965 and <2015 = new.year
        then
        bookArrayList.add(book);
        System.out.println(bookArrayList);
    }

}
