// LeetCode : 268 : Missing Number
// Given an array nums containing n distinct numbers in the range [0, n],
// return the only number in the range that is missing from the array.

 
// Example 1:
// Input: nums = [3,0,1]
// Output: 2

// Explanation:
// n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
// 2 is the missing number in the range since it does not appear in nums.

// Example 2:
// Input: nums = [0,1]
// Output: 2

// Explanation:
// n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
// 2 is the missing number in the range since it does not appear in nums.

// Example 3:
// Input: nums = [9,6,4,2,3,5,7,0,1]
// Output: 8

// Explanation:
// n = 9 since there are 9 numbers, so all numbers are in the range [0,9].
// 8 is the missing number in the range since it does not appear in nums.


// Constraints:
// n == nums.length
// 1 <= n <= 104
// 0 <= nums[i] <= n
// All the numbers of nums are unique.
 

// Follow up: Could you implement a solution using only O(1) 
// extra space complexity and O(n) runtime complexity?

public class Problem_051 {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
    static int missingNumber(int[] nums){
        cycleSort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(nums[i] != i){
                return i;
            }
        }
        return n;
    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[correctIndex] != arr[i]){
                //swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else {
                i++;
            }
        }

    }
    //One can also do the solution in this way. This would be more efficient with 0ms runtime.
    /** public int missingNumber(int[] nums) {
        int n = nums.length;
        int total_sum = (n*(n+1))/2;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+nums[i];
        }
        return total_sum-sum;
    }
     */
}