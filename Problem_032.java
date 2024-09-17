//LeetCode : 33 : Search In Rotated Sorted Array

//There is an integer array nums sorted in ascending order (with distinct values).

//Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
//such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
//For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

//Given the array nums after the possible rotation and an integer target,
//return the index of target if it is in nums, or -1 if it is not in nums.

//You must write an algorithm with O(log n) runtime complexity.


//Example 1:
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4

//Example 2:
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1

//Example 3:
//Input: nums = [1], target = 0
//Output: -1


//Constraints:
//1 <= nums.length <= 5000
//-104 <= nums[i] <= 104
//All values of nums are unique.
//nums is an ascending array that is possibly rotated.
//-104 <= target <= 104

public class Problem_032 {
    public static void main(String[] args){
        int[] nums = {4,5,1,2,3};
        int target = 1;
        int ans = search(nums, target);
        if(ans == -1) System.out.println("No element found");
        else System.out.println("Element found at index : "+ans);
    }
    static int search(int[] nums, int target){
        int initial = nums[0];
        int end = nums.length-1;
        int peak = peakIndex(nums);
        if(nums[peak] == target) return peak;
        if(peak == end) return binarySearch(nums,target, 0, end);
        if(target < initial) return binarySearch(nums, target, peak + 1, end);
        else return binarySearch(nums, target, 0, peak);
    }
    static int peakIndex(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        if(end == 0) return 0;

        if(nums[start] < nums[end]) return end;
        if(nums[start] > nums[start+1]) return start;
        int mid;
        int initial = nums[0];
        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] >= initial) start = mid + 1;
            else end = mid - 1;
        }
        return end;
    }
    static int binarySearch(int[] nums, int target, int start, int end){
        int mid;
        while(start<=end){
            mid = start + (end - start)/2;
            if(target == nums[mid]) return mid;
            else if (target < nums[mid]) end = mid -1;
            else start = mid + 1;
        }
        return -1;
    }
}
