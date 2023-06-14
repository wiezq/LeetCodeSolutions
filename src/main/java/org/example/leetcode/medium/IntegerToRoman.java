package org.example.leetcode.medium;

public class IntegerToRoman {
    static String[] ONES = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    static String[] TENS = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    static String[] HRNS = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    static String[] THS = {"", "M", "MM", "MMM"};

    public String intToRoman(int num) {
        return THS[num / 1000] + HRNS[(num % 1000) / 100] + TENS[(num % 100) / 10] + ONES[num % 10];
    }

}
