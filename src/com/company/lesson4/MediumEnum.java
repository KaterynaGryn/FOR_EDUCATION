package com.company.lesson4;

public enum  MediumEnum {

    JANUARY("Январь месяц"),
    FEBRUARY("Февраль"),
    MARCH("Март"),
    APRIL("Апрель"),
    MAY("Май"),
    JUNE("Июнь"),
    JULY("Июль"),
    AUGUST("Август"),
    SEPTEMBER("Сентябрь"),
    OCTOBER("Октябрь"),
    NOVEMBER("Ноябрь"),
    DECEMBER("Декабрь");

    private final String nameRu;
    MediumEnum(String nameRu){this.nameRu = nameRu;}
@Override
    public String toString (){return nameRu;}

}
