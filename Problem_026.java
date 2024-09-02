//LeetCode : 744 : Find Smallest Letter Greater Than Target

// You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
//There are at least two different characters in letters.

// Return the smallest character in letters that is lexicographically greater than target.
//If such a character does not exist, return the first character in letters.

 

// Example 1:
// Input: letters = ["c","f","j"], target = "a"
// Output: "c"
// Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

// Example 2:
// Input: letters = ["c","f","j"], target = "c"
// Output: "f"
// Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.

// Example 3:
// Input: letters = ["x","x","y","y"], target = "z"
// Output: "x"
// Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
 

// Constraints:
// 2 <= letters.length <= 104
// letters[i] is a lowercase English letter.
// letters is sorted in non-decreasing order.
// letters contains at least two different characters.
// target is a lowercase English letter

//Lexicographical order, also known as alphabetical order or dictionary order,
// refers to the way words or strings are ordered based on the sequence of their characters.
// It follows the same rules as the order used in dictionaries.
// For example, when comparing two words, the first character of each word is compared;
// if they are the same, the next character is compared, and so on, until a difference is found.
//
//For example:
//"apple" comes before "banana" because 'a' comes before 'b' in the alphabet.
//"cat" comes before "dog" because 'c' comes before 'd'.
//In programming and computer science, lexicographical order is often used to sort lists of strings or characters.

public class Problem_026 {
    public static void main(String[] args){
        char[] letters = {'c','f','j'};
        char target = 'g';
        char ans = nextGreatestLetter(letters,target);
        System.out.println("Ans for the given input is : "+ans);
    }
    static char nextGreatestLetter(char[] letters , char target){
        if(target < letters[0]) return letters[0];
        if(target >= letters[letters.length-1]) return letters[0];
        int start = 1;
        int end = letters.length -1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(target >= letters[mid]) start = mid + 1;
            else end = mid;
        }
        return letters[start];
    }
}