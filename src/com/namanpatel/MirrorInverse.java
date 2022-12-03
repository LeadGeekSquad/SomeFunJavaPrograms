package com.namanpatel;

import java.util.Arrays;

public class MirrorInverse {
    public static void main(String[] args) {
        int[] arr= {3,4,2,0,1};

        if(isMirrorInverse(arr)){
            System.out.println(Arrays.toString(arr) + " is a real mirror " +
                    "inverse array");
        } else {
            System.out.println(Arrays.toString(arr) + " is not a mirror inverse array");
        }
    }

    static boolean isMirrorInverse(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            if(arr[arr[i]] != i){
                return false;
            }
        }
        return true;
    }
}
