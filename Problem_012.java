//Reverse an array

import java.util.Arrays;
public class Problem_012 {
     public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}
