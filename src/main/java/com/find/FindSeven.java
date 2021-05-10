package com.find;

public class FindSeven {

    public static final int SEVEN = 7;

    /**
     * This function takes an array of numbers and return true if
     * there is a seven at least in one array number.
     * @param array
     * @return true or false
     */
    public boolean findSeven(int[] array){

        for(int i=0; i<array.length; i++){
            int num = array[i];
            while(num > 0 ) {  // if false means that we have compare all digits
                if (num % 10 == SEVEN) { // is the last digit equal to 7.
                    System.out.println("Found");
                    return true;
                }
                num = num / 10; // remove the last digit
            }

        }
        return false;
    }

}
