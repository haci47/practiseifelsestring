package com.erg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your credi card number");
        int kredicart = scan.nextInt();
        String strno = Integer.valueOf(kredicart).toString();
        if (strno.length() >= 5) {
            System.out.println("first number :" +strno.charAt(0));
            System.out.println("second number :" +strno.charAt(1));
            System.out.println("third number :" +strno.charAt(strno.length()-1));
        } else {
            System.out.println("wrong number entered");
        }

    }
}
