//LeetCode : 1295 : Find Numbers With Even Number Of Digits
//Given an array nums of integers, return how many of them contain an even number of digits.

 

// Example 1:

// Input: nums = [12,345,2,6,7896]
// Output: 2
// Explanation: 
// 12 contains 2 digits (even number of digits). 
// 345 contains 3 digits (odd number of digits). 
// 2 contains 1 digit (odd number of digits). 
// 6 contains 1 digit (odd number of digits). 
// 7896 contains 4 digits (even number of digits). 
// Therefore only 12 and 7896 contain an even number of digits.

public class Problem_019 {
    public static void main(String[] args){
        int[] nums = {12,345,2,6,7896,34};
        int ans = evenDigits(nums);
        if(ans == -1) System.out.println("Array is empty");
        else System.out.println("Total even no. of digits are : "+ans);
    }

    static int evenDigits(int[] nums){
        if(nums.length == 0) return -1;
        int count = 0;
        for(int ele : nums){
            int countDigits = counter(ele);
            if(countDigits % 2 == 0) count++;
       }
       return count;
    }

    //Instead of writing all these codes I simply can use a method to count the digit of a number
    //We have to convert any negative no. to positive no.
    //if(digit<0) digit *= -1;
    //as the below method works only on +ve no.s
    //return (int)Math.log10(digit) +1 ;

    static int counter(int digit){
        if(digit<0) digit *= -1;
        int countDigits =0;
        while(digit>0){
            digit = digit/10;
            countDigits++;
        }
        return countDigits;
    }
}
