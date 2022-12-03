package com.namanpatel;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text that you like to reverse: ");
        String text = sc.nextLine();

        //reverseString(text);

        System.out.println("Original String:" + text +
                           "\nReverse String of original string:" + reverseString(text));
    }

    private static String reverseString(String text) {
        String[] words = text.split(" ");
        String revString = "" ;
        for(String word:words){
            StringBuilder sb = new StringBuilder(word);
            revString = revString + sb.reverse() + " " ;
        }
        return revString;
    }
}
