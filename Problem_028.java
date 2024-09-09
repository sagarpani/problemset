//Find position of an element in a sorted array of infinite numbers
//Suppose you have a sorted array of infinite numbers, how would you search an element in the array? 
//Source: Amazon Interview Experience
//Since array is sorted, the first thing that clicks into mind is Binary Search,
//but the problem here is we don't know the size of the array.
//If the array is infinite, that means we don't have proper bounds to apply binary search.
//So in order to find position of key, first we find bounds, and then we apply binary search algorithm.
//Let low be pointing to first element and high be pointing to second element of array.
//Now compare key with high index element.
//If it is greater than high index element then copy high index in low index and double the high index.
//If it is smaller, then apply binary search on high and low indices found.

public class Problem_028 {
    public static void main(String[] args){
        int[] arr ={1,2,5,8,20,25,31,39,40,49,58,79,88,92,100,120,200,203,205,209,300,308,309,310,311,312,313,314,315,316,317,318,319,320};
        int key = 205;
        int ans = ans(arr, key);
        if(ans == -1) System.out.println("Element not found");
        else System.out.println("Element is at : "+ans);
    }
    static int ans(int[] arr, int key){
        int start = 0;
        int end = 6;
        while(key > arr[end]){
                int temp = start;
                start = end + 1;
                end = start + (end- temp)* 2;
        }
        return binarySearch(arr, key, start, end);
    }

    static int binarySearch(int[] arr, int key, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (key == arr[mid]) return mid;
            else if (key < arr[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
