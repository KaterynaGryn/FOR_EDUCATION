package com.company.myAdditionalWork;

public class TemperatureConverter {


    public int convertTemp(int temperature, char convertTo) {
        if (convertTo == 'F') {
            temperature = (temperature * 9 / 5 + 32);
            System.out.println("Temperature in Fahrenheit is " + temperature);
        }
        else if (convertTo == 'C'){
            temperature = ((temperature - 32)*5/9);
            System.out.println("Temperature in Celsius is " + temperature);
        }

        else {

            System.out.println("You've entered an invalid symbol in convertTo, please recheck");

        } return temperature;
    }}