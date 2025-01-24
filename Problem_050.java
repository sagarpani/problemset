//Cyclic Sort algorithm when elements are from 1 to n

import java.util.Arrays;

public class Problem_050 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while(i<arr.length){

            int correctIndex = arr[i] - 1;
            
            if(arr[correctIndex] != arr[i]){
                //swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else {
                //move forward
                i++;
            }
        }

    }
}