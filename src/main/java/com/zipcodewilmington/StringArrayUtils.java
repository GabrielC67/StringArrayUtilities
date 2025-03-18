package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String s : array) {
            if (Objects.equals(s, value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] revArr = new String[array.length];
        int s = 0;
        for(int i = array.length - 1; i >= 0; i--){
            revArr[s] = array[i];
            s++;
        }
        return revArr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        /*
 true       String[] array = {"a", "b", "c", "b", "a"};
 true       String[] array = {"Is this a palindrome?", "This is a palindrome", "Is this a palindrome?"};
 false       String[] array = {"Is this a plaindrome?", "This is not a plaindrome", "Is this a palindrome?", "This is not a palindrome"};
         */
        String[] reverseStrArr = new String[array.length];

        for(int i =  0, j = array.length - 1; i < array.length; i++, j--){
            reverseStrArr[i] = array[j];
        }
        //array == reverseStrArr is incorrect. Use Arrays.equals();
        return Arrays.equals(array, reverseStrArr);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
/*
true        String[] array = {"The quick brown", "Fox jumps over", "The lazy dog"};
true        String[] array = {"The", "quick", "onyx", "goblin", "jumps", "over", "the", "lazy", "dwarf"};
true        String[] array = {"Five quacking", "zephyrs", "jolt my", "wax bed"};
false        String[] array = {"a", "b", "c", "d"};

 */
       /*int length = 0;
       for(String arrStr : array){
           length += arrStr.length();
       }*/ //May not need this
        //ArrayList <String> newArrayList = new ArrayList<>();
        int counter = 0;
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String str = String.join(",", array);
        //for(String strArr : array) {
        for (String s : alphabet) {
            if (str.toLowerCase().contains(s)) {
                counter++;
                //This needs an if statement to compare the parameter against the alphabet array.
            }

        }
        //}
        return counter == 26;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        /*
        String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        int expected = 4;

        String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        int expected = 2;

        String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        int expected = 4;
         */

        int counter = 0;
        for (String s : array) {
            if (Objects.equals(value, s)) {
                counter++;
            }
        }
        return counter; //Returns Int... Not Boolean
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        /*
        String[] array = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] actual = StringArrayUtils.removeValue(array, "The");

        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"the", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] actual = StringArrayUtils.removeValue(array, "quick");

        String[] array = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] expected = {"the", "quick", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] actual = StringArrayUtils.removeValue(array, "brown");
         */
        ArrayList<String> newArr = new ArrayList<>(array.length);
        for(String str : array){
            if (!str.equals(valueToRemove)){
                newArr.add(str);
            }
        }
        return newArr.toArray(new String[array.length - 1]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }
}
