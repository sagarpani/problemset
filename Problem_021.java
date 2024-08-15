//Order Agnostic Binary Search

public class Problem_021 {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, 3, 4, 56, 67};
        int[] pari = {8, 7, 6,5, 4, 3, 2, 1, -3, -23};
        int key = 4;
        int key2 = -3;
        int ans = orderAgnosticBinarySearch(arr, key);
        int pariAns = orderAgnosticBinarySearch(pari, key2);
        if(ans == -1) System.out.println("Element not found");
        else {
            System.out.println("Key is found at index : "+ans);
            System.out.println("Key is found at index : "+pariAns);
        }
    }
    static int orderAgnosticBinarySearch(int[] arr, int key){
        if(arr.length == 0) return -1;

        int start = 0;
        int end = arr.length-1;
        //Cheacking whether the array is Ascending or Descending
        boolean isAsc = arr[0] < arr[end];

        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == key) return mid;

            if(isAsc){
                if(key < arr[mid]) end = mid-1;
                else start = mid +1;
            }
            else{
                if(key < arr[mid]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}
