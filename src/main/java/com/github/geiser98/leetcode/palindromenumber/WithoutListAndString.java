package com.github.geiser98.leetcode.palindromenumber;

public class WithoutListAndString {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        int number = x;
        int revers = 0;
        int remains;
        while (number > 0) {
            remains = number % 10;
            revers = revers * 10 + remains;
            number /= 10;
        }
        return revers == x;
    }
}
