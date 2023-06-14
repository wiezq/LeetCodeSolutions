package org.example.neetcode.twoPointers;

public class ValidPalindrome {

/**

    <p>Checks if a given string is a palindrome.</p>
     <p>A palindrome is a word, phrase, number, or other sequence of characters
     that reads the same forward and backward.</p>
     <p>Time complexity: O(n)</p>
     <p>The algorithm uses a while loop to iterate through
        the string from both ends simultaneously, and performs constant-time operations</p>
     <p>Space complexity: O(n)</p>
     <p>the amount of memory required by the algorithm is constant and does not depend on the size of the input string.
        This is because the code uses only a fixed number of variables (l, r, leftChar, and rightChar) to store its state,
        and does not use any additional data structures.</p>
    @param s the string to check for palindrome
    @return true if the input string is a palindrome, false otherwise
 */
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        char leftChar;
        char rightChar;
        while (l < r && l < s.length() && r >= 0) {
            while (!Character.isLetterOrDigit(s.charAt(l)) && l < r){
                l++;
            }
            while (!Character.isLetterOrDigit(s.charAt(r)) && l < r){
                r--;
            }

            leftChar = Character.toLowerCase(s.charAt(l));
            rightChar = Character.toLowerCase(s.charAt(r));

            if(leftChar != rightChar) return false;
            l++;
            r--;
        }
        return true;
    }
}
