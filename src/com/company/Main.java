package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        System.out.println("Enter employee name");
        String employeeName1 = input.next();

        System.out.println("How many hours have you worked this week?");
        double hoursWorked = input.nextDouble();

        System.out.println("What is your hourly wage?");
        double hourlyWage = input.nextDouble();

        if(hoursWorked > 45){
            double newWage = hoursWorked - 45;
            newWage = newWage * 1.5;
            newWage = newWage * 0.8;
            newWage = newWage * hourlyWage;
            System.out.println("Your new pay after tax is " + newWage);
        }
        else{
            hoursWorked = hoursWorked * 0.8;
            
            System.out.println(hourlyWage + "is your pay");
        }
    }
}
