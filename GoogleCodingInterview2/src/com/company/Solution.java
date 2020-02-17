package com.company;

import java.util.ArrayList;

public class Solution {
    public static int solution(int total_lambs) {
        //Your code here
        int cnt = 0;
        int fibPerson = 0;
        int fibcount = 0;
        ArrayList fibList = generateFib();
        int lmbCnt = total_lambs;
        System.out.println(fibList.get(fibcount));
        while (cnt <= lmbCnt) {
            int mom = (int) fibList.get(fibcount);
            cnt = cnt + mom;
            fibPerson++;
            fibcount++;
        }
        int cntS = 0;
        int fibPersonS = 0;
        int maxcountS = 0;
        ArrayList fibListS = generateGene();
        int lmbCntS = total_lambs;
        while (cntS <= lmbCntS) {
            int dad = (int) fibListS.get(maxcountS);
            cntS = cntS + dad;
            fibPersonS++;
            maxcountS++;
        }
        return ((fibcount-1)-(fibPersonS-1));
    }
    //note that fibbonaci is likely the stingiest (minimum) route
    public static ArrayList generateFib(){
        int start = 1;
        ArrayList<Integer> Joseph = new ArrayList<Integer>();
        int jLength = Joseph.size();
        Joseph.add(jLength,start);
        Joseph.add(jLength,start);
        int arrayCounter = 2;
        for (int i =1; i < 45; i++) {
            Joseph.add(arrayCounter, ((Joseph.get(arrayCounter - 1) + Joseph.get(arrayCounter - 2))));
            arrayCounter++;
        }
        return Joseph;
    }
    public static ArrayList generateGene(){
        ArrayList<Integer> dave = new ArrayList<Integer>();
        int counter = 1;
        dave.add(0, counter);
        for (int t=1; t <31; t++) {
            dave.add(counter, ((dave.get(counter-1))*2));
            counter++;
        }
        return dave;
    }

}
