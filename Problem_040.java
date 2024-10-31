//Selection Sort Algorithm

import java.util.Arrays;
public class Problem_040 {
     public static void main(String[] args){
        int[] arr = {-34, 45, 1, 3424, 14};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            int start =i;
            int end = arr.length - 1;
            int minIndex = minIndex(arr, start, end);
            swapping(arr, minIndex, start);
        }

    }
    static int minIndex(int[] arr, int start, int end){
        int min = start;
        for(int i = start; i<= end;i++){
            if(arr[i] < arr[min]){
                min = i;
            }
        }
        return min;
    }
    static void swapping(int[] arr,int minIndex, int rightIndex){
        int temp = arr[minIndex];
        arr[minIndex] = arr[rightIndex];
        arr[rightIndex] = temp;
    }
}
