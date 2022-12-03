package com.namanpatel;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word to check if that word is Palindrome: ");
        String word = sc.next();

        if(isPalindrome(word)){
            System.out.println(word + " is Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }

        sc.close();
    }

    static boolean isPalindrome(String word){
        int forwardIndex = 0, backwardIndex=word.length()-1;
        while(forwardIndex<=backwardIndex){
            char startChar = word.charAt(forwardIndex);
            char endChar = word.charAt(backwardIndex);

            if(startChar != endChar)
                return false;

            forwardIndex++;
            backwardIndex--;
        }
        return true;
    }
}
