//Sagar Patel, CSCI 1660, 1/21/2020
package com.company.Patel;

public class Main {

    public static void main(String[] args) {
    String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	int[] temp = {45, 29, 10, 22, 41, 28, 33};
    int[] snowPer = {95, 60, 25, 5, 0, 75, 90};

        for (int i=0; i<days.length; i++) {
            if (temp[i] <= 32 & snowPer[i] > 50) {
                System.out.println(days[i]);

            }
        }


    }
}
