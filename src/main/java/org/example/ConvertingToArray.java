package org.example;

import java.util.ArrayList;
import java.util.List;

public class ConvertingToArray {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10 ) {
            return true;
        }
        List<Integer> listX = new ArrayList<>();
        while (x > 0) {
            listX.add(x % 10);
            x /= 10;
        }
        for (int i = 0; i <= listX.size() / 2; i++) {
            if (listX.get(i) != listX.get(listX.size() - 1 - i)) {
                return false;
            }
        }
     return true;
    }
}
