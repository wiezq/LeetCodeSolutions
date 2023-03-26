package leetcode.arraysAndHashing;

import java.util.ArrayList;
import java.util.List;

/**

    <p>Time complexity:</p>
    <p>The encode method has a time complexity of O(n), where n is the total number of characters in all the input strings.</p>
    <p>The decode method has a time complexity of O(n), where n is the total number of characters in the input string.</p>
    <p>Therefore, the overall time complexity is O(n).</p>
    <p>Space complexity:</p>
    <p>The encode method uses a StringBuilder to create the encoded string. The space used by this StringBuilder is O(n),
    where n is the total number of characters in all the input strings. </p>
    <p>The decode method uses an ArrayList to store the
    decoded strings. The space used by this ArrayList is also O(n), where n is the total number of characters in the input
    string.</p>
    <p>Therefore, the overall space complexity is O(n).</p>
*/
public class EncodeAndDecode {

    /**

     Encodes a list of strings into a single string with a special delimiter.
     The delimiter is the '#' symbol.
     @param strs the list of strings to be encoded
     @return the encoded string
     */
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }
    /**

     Decodes a single string into a list of strings based on the delimiter.

     The delimiter is the '#' symbol.

     @param str the string to be decoded

     @return the decoded list of strings
     */
    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;

            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1 + length;
            list.add(str.substring(j + 1, i));
        }
        return list;
    }
}
