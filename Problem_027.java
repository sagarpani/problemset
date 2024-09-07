//LeetCode : 34 : Find First And Last Position Of Element In A Sorted Array 

// Given an array of integers nums sorted in non-decreasing order,
//find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

// Example 2:
// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]

// Example 3:
// Input: nums = [], target = 0
// Output: [-1,-1]
 

// Constraints:
// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109
// nums is a non-decreasing array.
// -109 <= target <= 109

import java.util.Arrays;

public class Problem_027 {
     public static void main(String[] args){
        int[] arr = {5,7,7,8,8,8,8,19};
        int target = 8;
        int[] ans = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
        if(nums.length ==0) return new int[]{-1,-1};
        ans[0] = findIndex(nums,target,true);
        if(ans[0] > -1) {
            ans[1] = findIndex(nums,target,false);}
        return ans;
    }
    static int findIndex(int[] nums , int target, boolean findFirstIndex){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid] < target) start = mid + 1;
            else if(nums[mid] > target) end = mid -1;
            else{
                ans = mid;
                if(findFirstIndex) end = mid -1;
                else start = mid + 1;
            }
        }
        return ans;
    }
}
