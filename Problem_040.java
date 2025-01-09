//Selection Sort Algorithm

import java.util.Arrays;
public class Problem_040 {
     public static void main(String[] args){
        int[] arr = {-34, 45, 1, 3424, 14};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for(int end = arr.length-1; end > 0; end--){
            int maxIndx = maxIndex(arr,0,end);
            if(maxIndx != end) {
                swapping(arr, maxIndx, end);
            }
        }

    }
    static int maxIndex(int[] arr, int start, int end){
        int max = 0;
        for (int i = start; i <= end; i++) {
            if(arr[i] > arr[max]) max = i;
        }
        return max;
    }
    static void swapping(int[] arr,int maxIndx, int end){
        int temp = arr[maxIndx];
        arr[maxIndx] = arr[end];
        arr[end] = temp;
    }
}
