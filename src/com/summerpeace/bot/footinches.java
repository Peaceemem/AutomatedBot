package com.summerpeace.bot;

import java.util.Scanner;

public class footinches {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the foot value: ");
        double feetvalue = sc.nextDouble();
        double inches  = convert(feetvalue);
        System.out.println(feetvalue + " Feet is equals to " + inches);
    }
    public static double convert(double feetvalue){
       return feetvalue * 12;

    }
}
