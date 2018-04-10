//1. Создать класс Book с полями: Название, Автор, Год издания, Количество страниц, Цена, Тип переплета(enum).
//        2. Создать класс Shopс полями: Название магазина, список книг
//        3. Создать методы для:
//        - удаления одной книги (по критериям "Название" и "Автор");
//        - добавление книги (сравнение по всем полям чтоб небыло повторов, при этом разрешается ввести несколько книг одного автора)
//        - вывод списка книг заданного автора;
//        - вывод списка книг, выпущенных заданным издательством;
//        - вывод списка книг, выпущенных в заданном интервале (включая границы);
package com.company.lesson6;

public class Book {
    String bookName;
    String author;
    long yearOfpublishing;
    int numberOfPages;
    int price;
    String typeOfbindingSimpleEnum;


    public Book(String bookName, String author, long yearOfpublishing, int numberOfPages, int price, String typeOfbindingSimpleEnum) {

        this.bookName = bookName;
        this.author = author;
        this.yearOfpublishing = yearOfpublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.typeOfbindingSimpleEnum = typeOfbindingSimpleEnum;
    }


    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public long getYearOfpublishing() {
        return yearOfpublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public String getTypeOfbindingSimpleEnum() {
        return typeOfbindingSimpleEnum;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearOfpublishing(long yearOfpublishing) {
        this.yearOfpublishing = yearOfpublishing;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setTypeOfbindingSimpleEnum(String typeOfbindingSimpleEnum) {
        this.typeOfbindingSimpleEnum = typeOfbindingSimpleEnum;
    }
}
