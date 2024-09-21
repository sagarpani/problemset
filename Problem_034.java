//LeetCode : 410 : Split Array Largest Sum

//Given an integer array nums and an integer k, split nums into k non-empty subarrays
//such that the largest sum of any subarray is minimized.

//Return the minimized largest sum of the split.

//A subarray is a contiguous part of the array.


//Example 1:
//Input: nums = [7,2,5,10,8], k = 2
//Output: 18
//Explanation: There are four ways to split nums into two subarrays.
//The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.

//Example 2:
//Input: nums = [1,2,3,4,5], k = 2
//Output: 9
//Explanation: There are four ways to split nums into two subarrays.
//The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.


//Constraints:
//  1 <= nums.length <= 1000
//  0 <= nums[i] <= 106
//  1 <= k <= min(50, nums.length)

public class Problem_034 {
    public static void main(String[] args){
        int[] nums = {7,2,5,10,8};
        int k = 3;
        int ans = splitArray(nums,k);
        System.out.println(ans);

    }
    static int splitArray(int[] nums,int k) {
        int start = 0;
        int end = 0;
        for (int num : nums) {
            start = Math.max(start, num);// This is a method which simply going to give the maximum value from the array by using simple linear search nothing else.
            end += num;
        }
        //binary search
        while (start < end) {
            int mid = start + (end - start) / 2;//This value will be considered as the maximum value in which the elements can sum upto
            //Calculate in how many pieces you can divide this array
            int piece = 1;//Here the initial value of piece is considered to be 1 as at least you can divide the entire array into 1 piece/sub array
            int sum = 0;
            for (int num : nums) {
                if (sum + num > mid) {
                    //then you can't add the new num into this sub array
                    //you have to create a new sub array and add this num to that, then sum = num
                    sum = num;//Here is so as one sub array has already been added and the num to the new array as well.
                    //So now we have to create a new sum for the new sub array, and we assign the starting value to sum which is num.
                    piece++;
                }
                else sum += num;
            }
            if (piece <= k) end = mid;
            else start = mid + 1;


        }
        return start;//here start = end;
    }
}