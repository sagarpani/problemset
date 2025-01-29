// LeetCode : 287 : Find the Duplicate Number

// Given an array of integers nums containing n + 1 integers where each integer
// is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and
// using only constant extra space.


// Example 1:
// Input: nums = [1,3,4,2,2]
// Output: 2

// Example 2:
// Input: nums = [3,1,3,4,2]
// Output: 3

// Example 3:
// Input: nums = [3,3,3,3,3]
// Output: 3

// Constraints:
// 1 <= n <= 105
// nums.length == n + 1
// 1 <= nums[i] <= n
// All the integers in nums appear only once except for
// precisely one integer which appears two or more times.

public class Problem_053 {
    public static void main(String[] args){
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] != i+1) {
                int rightIndex = nums[i] - 1;
                if (nums[i] != nums[rightIndex]) {
                    //swap
                    int temp = nums[i];
                    nums[i] = nums[rightIndex];
                    nums[rightIndex] = temp;
                }
                else return nums[i];
            }
            else i++;
        }
        return -1;
    }
}
