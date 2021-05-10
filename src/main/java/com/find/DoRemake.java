package com.find;

public class DoRemake {

    public static final char[] VOWELS = {'a','e','i','o','u', 'A', 'E', 'I', 'O', 'U'};
    public static final String WAY = "way";
    public static final String AY = "ay";

    /**
     * This function takes a string of words and
     * Move the first letter of each word to the end of the word.
     * Add "ay" to the end of the word.
     * Words starting with a vowel (a,e,i,o,u, A, E, I, O, U) simply have "way" appended to the end.
     * Preserve proper capitalization and punctuation.
     * @param sentence
     * @return string
     */
    public String doRemake(String sentence){
        String words[] = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for(int i=0; i< words.length; i++) {
            if((i+1) == words.length){ // if is the last word.
                reversedSentence.append( reverseWord( removeLastChar(words[i]) ) + ".");
            }else{
                reversedSentence.append(reverseWord(words[i]) + " ");
            }
        }

        return reversedSentence.toString();
    }

    /**
     * Remove last character from a word (only for the last word).
     * Remove the "."
     * @param s
     * @return
     */
    private String removeLastChar(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        return s.substring(0, s.length()-1);
    }

    /**
     * Reverse word with the criteria of doRemake function.
     * @param word
     * @return string
     */
    private String reverseWord(String word){
        if(isVowel(word.charAt(0))){
            return addWay(word);
        }else{
            return addAy(reversedNotVowelWord(word));
        }
    }

    /**
     * Removing the first character of a String.
     * @param s
     * @return string
     */
    private String removeFirstChar(String s){
        return s.substring(1);
    }

    /**
     * Put the first letter of a String at the end of it.
     * @param word
     * @return string
     */
    private String swapFirstToLast(String word)
    {
        if (word.length() < 2)
            return word;
        char firstLetter = word.charAt(0);
        String temp = removeFirstChar(word);

        return temp + firstLetter;
    }

    /**
     * Upper case the first letter of a word
     * @param line
     * @return string
     */
    private String capitalizeFirstLetter(final String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }

    /**
     * Reverse word with the criteria of doRemake function.
     * @param word
     * @return string
     */
    public String reversedNotVowelWord(String word){
        if(Character.isUpperCase(word.charAt(0))){
            String swapFirstToLast = swapFirstToLast(word.toLowerCase());
            return capitalizeFirstLetter(swapFirstToLast);
        }else{
            return swapFirstToLast(word);
        }
    }


    /**
     * Add "way" at the end of the word
     * @param word
     * @return string
     */
    private String addWay(String word){
        return word + WAY;
    }

    /**
     * Add "ay" at the end of the word
     * @param word
     * @return string
     */
    private String addAy(String word){
        return word + AY;
    }

    /**
     * Check if the provided character is a vowel.
     * @param alpha
     * @return
     */
    private boolean isVowel(char alpha){
        for (char c : VOWELS) {
            if(c == alpha){
                return true;
            }
        }
        return false;
    }

}
