// LeetCode : 896 : Monotonic Array

// An array is monotonic if it is either monotone increasing or monotone decreasing.
// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j].
//An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

// Given an integer array nums, return true if the given array is monotonic, or false otherwise.

 // Example 1:
// Input: nums = [1,2,2,3]
// Output: true

// Example 2:
// Input: nums = [6,5,4,4]
// Output: true

// Example 3:
// Input: nums = [1,3,2]
// Output: false
 

// Constraints:
// 1 <= nums.length <= 105
// -105 <= nums[i] <= 105

public class Problem_045 {
    public static void main(String[] args) {
        int[] nums = {90,49,50,300};
        System.out.println(isMonotonic(nums));
    }

    static boolean isMonotonic(int[] nums){
        //checking which one is larger between the first element and the last element
        boolean val = nums[0] < nums[nums.length-1];

        //if first element < last element then there is a possibility that the array might be increasing monotonic
        if(val){
            for(int i=0; i<nums.length-1; i++){
                //check if at any point it contradicts the checked value then return false and break the loop
                if(nums[i] > nums[i+1]) return false;
            }
        }
        //if first element > last element then there is a possibility that the array might be decreasing monotonic
        
        else{
            for(int i=0;i<nums.length-1;i++){
                //check if at any point it contradicts the checked value then return false and break the loop
                if(nums[i] < nums[i+1]) return false;
            }
        }

        return true;
    }
}
