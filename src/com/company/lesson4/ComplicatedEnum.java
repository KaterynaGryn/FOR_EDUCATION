package com.company.lesson4;

public enum ComplicatedEnum {

    JANUARY("Январь месяц", "Січень", 31, Season.WINTER),
    FEBRUARY("Февраль", "Лютий", 28, Season.WINTER),
    MARCH("Март", "Березень", 31, Season.AUTUMN),
    APRIL("Апрель", "Квітень", 30, Season.SPRING),
    MAY("Май", "Травень", 31, Season.SPRING),
    JUNE("Июнь", "Червень", 31, Season.SUMMER),
    JULY("Июль", "Липень", 30, Season.SUMMER),
    AUGUST("Август", "Серпень", 31, Season.SUMMER),
    SEPTEMBER("Сентябрь", "Вересень", 30, Season.AUTUMN),
    OCTOBER("Октябрь", "Жовтень", 31, Season.AUTUMN),
    NOVEMBER("Ноябрь", "Листопад", 30, Season.AUTUMN),
    DECEMBER("Декабрь", "Грудень", 31, Season.WINTER);

    private final String nameRu;
    private final String nameUa;
    private final int days;
    private final Season season;


    ComplicatedEnum(String nameRu, String nameUa, int days, Season season) {
        this.nameRu = nameRu;
        this.nameUa = nameUa;
        this.days = days;
        this.season = season;
    }

    @Override
    public String toString() {
        return nameRu;
    }

    private enum Season {
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN;
    }
}
