package com.company.myAdditionalWork;

public class MakingDecisionsStatements {

    public double currencyConverterForMyTrip(double rateToday) {

        if (rateToday > 26.61) {

            double sumOfMoney = Math.round (899.44 * rateToday - 899.44 * 26.61);
            System.out.println("You've saved " + sumOfMoney + " Hryvnas");

            return sumOfMoney;
        } else {
            double sumOfMoney = Math.round (899.44 * 26.61 - 899.44 * rateToday);
            System.out.println("You've lost " + sumOfMoney + " Hryvnas");
            return sumOfMoney;
       }
    }

    public String whatToWearToday(int temperatureInKyiv){

        switch (temperatureInKyiv){

            case 2:

                System.out.println("winter is coming, wear hot things");
                break;

        }
        return "cold";
    }

}
