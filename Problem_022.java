//LeetCode : 852 : Peak Index In A Mounted Array

//You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//Return the index of the peak element.
//Your task is to solve it in O(log(n)) time complexity.


//Example 1:
//Input: arr = [0,1,0]
//Output: 1

//Example 2:
//Input: arr = [0,2,1,0]
//Output: 1

// Constraints:
// 3 <= arr.length <= 105
// 0 <= arr[i] <= 106
// arr is guaranteed to be a mountain array.

public class Problem_022 {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,5,4,3,2,1};
        int ans = peakIndex(arr);
        System.out.println("The peak index is : "+ans);

    }
    static int peakIndex(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid+1]) start = mid + 1;
            else end = mid;
        }
        return start;
    }

}