package org.example;

/**
 * не работает с числами в которых есть 0
 */
public class WithoutArrayAndReverse {

    public boolean isPalindrome(int x) {
        int xFirst = 0;
        int xPast = 0;
        int xNext = x;
        int length = String.valueOf(xNext).length();
        while (length > 1) {
            xFirst = (int) (xNext / Math.pow(10, length - 1));
            int i = length - 1;
            xPast = (int) (xNext % 10);
            if (xFirst != xPast) {
                return false;
            }
            xNext = (int) (xNext - (xFirst * Math.pow(10, length - 1))) / 10;
            length = String.valueOf(xNext).length();

        }
        return true;
    }
}
