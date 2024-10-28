//Bubble Sort Algorithm

import java.util.Arrays;
public class Problem_039{
    public static void main(String[] args){
        int[] arr ={4,23,453, 23, 554};
        bubbleSort(arr);
        System.out.println("The sorted array is : "+Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        boolean swapped;
        //this loop will run for n-1 times
        for(int i= 0; i < arr.length; i++){
            //for each step max item will come to the end respective index at every parse
            swapped = false;
            for(int j = 1; j < arr.length - i; j++){
                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j-1];
                    arr[j-1]= arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}