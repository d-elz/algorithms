package com.find;

public class DigitSum {

    /**
     * This function accepts an integer and calculates the sum of it's digits.
     * If the sum is greater that 9 call the function again (recursion).
     * @param number
     * @return sum
     */
    public int digitSum(int number){
        int num = number;
        int sum = 0;

        while(num > 0 ) { // if false means that we have sum all numbers
            sum = sum + (num % 10); // get the last digit
            num = num / 10; // remove the last digit
        }

        if(sum <= 9){
            return sum;
        }else{
            return digitSum(sum);
        }

    }

}
