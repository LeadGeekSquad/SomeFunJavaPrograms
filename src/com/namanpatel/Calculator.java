package com.namanpatel;
import java.util.Scanner;

public class Calculator {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.println("Enter the operation {+,-,*,/}: ");
        char operator = sc.next().charAt(0);

         //calculate(number1,number2,operator);


        System.out.println
                (number1 + " " +
                        operator + " " +
                        number2 + " = " +
                        calculate(number1,number2,operator));

        sc.close();
    }

    public static String calculate(int x, int y, char operator){
        String result = "OOPS !! you typed INVALID operator... Please enter a valid " +
                "operator to calculate the result";
        switch (operator) {
            case '+' : result = String.valueOf(x+y);
            break;

            case '-' : result = String.valueOf(x-y);
            break;

            case '*' : result = String.valueOf(x*y);
            break;

            case '/' : result = String.valueOf(x/y);
            break;

            default :
                System.out.println("OOPS! Invalid Operator");
        }

        return result;
    }
}
