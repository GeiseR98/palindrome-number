package com.github.geiser98.leetcode.palindromenumber;

/**
 * самое долгое решение
 */
public class WithoutArrayAndReverse {

    public boolean isPalindrome(int x) {
        int xFirst;
        int xPast;
        int xNext = x;
        int length = String.valueOf(xNext).length();
        int lengthBefore;
        while (length > 1) {

            xFirst = (int) (xNext / Math.pow(10, length - 1));
            int i = length - 1;
            xPast = (int) (xNext % 10);
            if (xFirst != xPast) {
                return false;
            }
            xNext = (int) (xNext - (xFirst * Math.pow(10, length - 1))) / 10;
            lengthBefore = length;
            length = String.valueOf(xNext).length();
            if (xNext == 0) {
                return true;
            }
            int numberOfZero = lengthBefore - length;
            if (numberOfZero > 2) {
                if (xNext % Math.pow(10, numberOfZero - 2) != 0) {
                    return false;
                }
                xNext /= Math.pow(10, numberOfZero - 2);
                length = String.valueOf(xNext).length();
            }
        }
        return true;
    }
}
