package com.namanpatel;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type the number you want a factorial of: ");
        int fact = sc.nextInt();

        int result = findFact(fact);

        System.out.println(fact+"!" + " = " + result);
    }

    public static int findFact(int number){

        if(number<0) {
        return -1;
        }

        if(number==0 || number==1) {
            return 1;
        }

        int fact = 1;
        for (int i = 2; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
