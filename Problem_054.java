// LeetCode : 442 : Find All Duplicates in an Array

// Given an integer array nums of length n where all the integers of nums
// are in the range [1, n] and each integer appears at most twice,
// return an array of all the integers that appears twice.

// You must write an algorithm that runs in O(n) time and
// uses only constant auxiliary space, excluding the space needed to store the output.

 

// Example 1:
// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [2,3]

// Example 2:
// Input: nums = [1,1,2]
// Output: [1]

// Example 3:
// Input: nums = [1]
// Output: []
 

// Constraints:
// n == nums.length
// 1 <= n <= 105
// 1 <= nums[i] <= n
// Each element in nums appears once or twice.

import java.util.ArrayList;
import java.util.List;

public class Problem_054 {
    public static void main(String[] args){
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    static List<Integer> findDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>(10);
        int start = 0;
        int end = nums.length;
        while (end > start) {
            int rightPlace = nums[start] - 1;
            if (nums[start] != nums[rightPlace]) {
                int temp = nums[start];
                nums[start] = nums[rightPlace];
                nums[rightPlace] = temp;
            } else start++;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1) list.add(nums[i]);
        }
        return list;
    }
}
