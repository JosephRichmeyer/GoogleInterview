package com.company;

public class Solution {
    public static String solution(int i) {
        // Created by Joseph Richmeyer
        //below finds primes and adds to a string
        //ideally no more than 10005 digits
        String primeList = "";
        String minionID = "";
        long start = 0;
        while ((primeList.length()) < (i + 5)){
            if (checkPrime(start)) {
                primeList = primeList.concat(Long.toString(start));
            }
             start++;
        }
        minionID = minionID.concat(Character.toString(primeList.charAt(i)));
        minionID = minionID.concat(Character.toString(primeList.charAt(i+1)));
        minionID = minionID.concat(Character.toString(primeList.charAt(i+2)));
        minionID = minionID.concat(Character.toString(primeList.charAt(i+3)));
        minionID = minionID.concat(Character.toString(primeList.charAt(i+4)));
        return minionID;
    }
    //checks if the passed long is prime, returns bool
    public static boolean checkPrime (long n){
        if (n==2){
            return true;
        } else if (n <= 1){
            return false;
        } else if ((n % 2) == 0) {
            return false;
        } else {
            for (int i = 3; i < n; i+=2){
                if ((n % i) == 0){
                    return false;
                }

            }
            return true;
        }
    }
}