// LeetCode : 541 : Reverse String II

// Given a string s and an integer k, reverse the first k characters for every 2k characters
// counting from the start of the string.

// If there are fewer than k characters left, reverse all of them.
// If there are less than 2k but greater than or equal to k characters,
// then reverse the first k characters and leave the other as original.

 

// Example 1:
// Input: s = "abcdefg", k = 2
// Output: "bacdfeg"

// Example 2:
// Input: s = "abcd", k = 2
// Output: "bacd"
 

// Constraints:
// 1 <= s.length <= 104
// s consists of only lowercase English letters.
// 1 <= k <= 104

public class Problem_041{
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;

        System.out.println("Original String: " + s);
        String result = reverseStr(s, k);
        System.out.println("Modified String: " + result);
    }
    /**
     * Reverses the first k characters of every 2k substring in the given string.
     * If fewer than k characters are left, reverse all of them.
     * If between k and 2k characters are left, reverse the first k characters.
     */
    static String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray(); // Convert string to mutable char array
        int n = charArray.length;

        for (int start = 0; start < n; start += 2 * k) {
            // Determine the range to reverse
            int end = Math.min(start + k - 1, n - 1); // Reverse at most k characters
            reverse(charArray, start, end);
        }

        return new String(charArray); // Convert back to string
    }

    /**
     * Reverses the characters in the char array from start to end indices.
     */
    static void reverse(char[] s, int start, int end) {
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}