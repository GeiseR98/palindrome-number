package com.github.geiser98.leetcode.palindromenumber;

/*
самое очевидное решение
 */
public class ConvertingToString {

    public boolean isPalindrome(int x) {
        String xString = String.valueOf(x);
        StringBuilder xRevers = new StringBuilder(xString).reverse();
        return xString.contentEquals(xRevers);
    }

}
