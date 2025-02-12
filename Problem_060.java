//Binary Search using recursion

public class Problem_060 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        int key = 9;
        System.out.println(binarySearch(arr,key,0,arr.length-1));
    }
    static int binarySearch(int[] arr, int key,int start, int end ) {
        if(start > end) return -1;
        int mid = start + (end - start)/2;
        //This one is the base condition
        if(arr[mid] == key) return mid;
        if(key > arr[mid]) return binarySearch(arr,key,mid+1, arr.length-1);
        return binarySearch(arr,key,0,mid-1);
    }
}
