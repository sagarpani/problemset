//Find Minimum Index In Mountain Array

//You may recall that an array arr is a mountain array if and only if:
//arr.length >= 3
//There exists some i with 0 < i < arr.length - 1 such that:
//arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
//Given a mountain array mountainArr, return the minimum index such that mountainArr[index] == target.
// If such an index does not exist, return -1.


//Example 1:
//Input: array = [1,2,3,4,5,3,1], target = 3
//Output: 2
//Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.

//Example 2:
//Input: array = [0,1,2,4,2,1], target = 3
//Output: -1

//Explanation: 3 does not exist in the array, so we return -1.

//Constraints:
// 3 <= mountain_arr.length <= 104
// 0 <= target <= 109
// 0 <= mountain_arr[index] <= 109


public class Problem_031 {
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5,3,1};
        int target = 3;
        int ans = findInMountainArray(target, arr);
        if(ans == -1) System.out.println("There is no such values");
        else System.out.println("The minimum index is : "+ans);
    }
    static int findInMountainArray(int target, int[] mountainArr) {
        int peak = peakIndex(mountainArr);
        int start =0;
        int end = mountainArr.length-1;
        int possibleAns = ascendingBinarySearch(mountainArr,target, start, peak);
        if(possibleAns != -1) return possibleAns;
        else return descendingBinarySearch(mountainArr, target, peak, end);
    }
    static int ascendingBinarySearch(int[] arr, int key, int start,int end){
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(key == arr[mid]) return mid;
            else if(key < arr[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
    static int descendingBinarySearch(int[] arr, int key, int start, int end){
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) return mid;
            else if (key < arr[mid]) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid+1]) start = mid + 1;
            else end = mid;
        }
        return start;
    }
}
