package com.find;

public class Main {

    public static void main(String[] args){
        DigitSum digitSum = new DigitSum();
        DoRemake doRemake = new DoRemake();
        FindSeven findSeven = new FindSeven();

        int findSevenArray[] = {2, 55, 60, 9642, 86};
        findSeven.findSeven(findSevenArray);

        int digitSumInt = digitSum.digitSum(173524);
        System.out.println("This is digit sum results " + digitSumInt);

        String testString = "This is a test.";
        String doRemakeString = doRemake.doRemake(testString);
        System.out.println("String: '" + testString + "' Revert: '"+doRemakeString + "'");
    }

}
