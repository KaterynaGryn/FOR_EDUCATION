package com.company.lesson1;

import java.util.ArrayList;



public class CheckMonths {

    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("January");
        stringArrayList.add("February");
        stringArrayList.add("March");
        stringArrayList.add("April");
        stringArrayList.add("May");
        stringArrayList.add("June");
        stringArrayList.add("July");
        stringArrayList.add("August");
        stringArrayList.add("September");
        stringArrayList.add("October");
        stringArrayList.add("November");
        stringArrayList.add("December");

        ArrayList<String> stringArrayList1 = new ArrayList<String>() {{
            add("January");
            add("February");
        }};

        String month = "Noveber";
        if (stringArrayList.contains(month)) {
            switch (month) {

                case "December":
                case "January":
                case "February":
                    System.out.println("winter");
                    break;
                case "March":
                case "April":
                case "May":
                    System.out.println("spring");
                    break;
                case "June":
                case "July":
                case "August":
                    System.out.println("summer");
                    break;
                case "September":
                case "October":
                case "November":
                    System.out.println("autumn");
                    break;
                default:
                    System.out.println(String.format("There was an error while inputing month name. Please fix it and try again"));
            }
        }
    }
}
