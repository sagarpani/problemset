// LeetCode : 448 : Find All Numbers Disappeared in an Array
//Asked in Google

// Hint
// Given an array nums of n integers where nums[i] is in the range [1, n],
// return an array of all the integers in the range [1, n] that do not appear in nums.

// Example 1:
// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]

// Example 2:
// Input: nums = [1,1]
// Output: [2]

// Constraints:
// n == nums.length
// 1 <= n <= 105
// 1 <= nums[i] <= n
 
// Follow up: Could you do it without extra space and in O(n) runtime?
// You may assume the returned list does not count as extra space.

import java.util.ArrayList;
import java.util.List;

public class Problem_052 {
    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDissapearedNumbers(arr);
        System.out.println(ans);
    }
    static List<Integer> findDissapearedNumbers(int[] nums){
        List<Integer> ans = new ArrayList<>(10);
        int i = 0;
        while(i < nums.length){
            int rightIndex = nums[i]-1;
            if(nums[i] != nums[rightIndex]){
                int temp = nums[i];
                nums[i] = nums[rightIndex];
                nums[rightIndex] = temp;
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index +1) ans.add(index +1);
        }
        return ans;
    }
}