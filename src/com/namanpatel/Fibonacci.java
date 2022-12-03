package com.namanpatel;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many fibonacci series numbers: ");
        int num = sc.nextInt();

        printFibonacci(num);

        sc.close();
    }

    public static void printFibonacci(int n){
        int x=1,y=0,z=0,count=1;
        while(count<=n) {
            System.out.print(z + "   ");
            z=x+y;
            x=y;
            y=z;
            count++;
        }

    }
}
