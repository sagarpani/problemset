//Search for 3 in the range of index[x,y]

import java.util.Arrays;
import java.util.Scanner;

public class Problem_016 {
    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = {18,12,-7,3,14,28};
            System.out.println("Array : "+Arrays.toString(arr));
            int number = 3;
            System.out.println("Finding num "+3+" in the array");

            System.out.print("start : ");
            int start = sc.nextInt();

            System.out.print("end : ");
            int end = sc.nextInt();

            if(end>=arr.length){
                System.out.println("Error");
                return;
            }

            int ans = check(arr,number,start,end);
            if(ans == Integer.MIN_VALUE) System.out.println("Element not found");
            else System.out.println("Element is found at : "+ans);
        }

    }
    static int check(int[] arr, int number, int start, int end){
        int min = Integer.MIN_VALUE;
        if(arr.length == 0) return min;
        while(start<=end){
            if(arr[start] == number) return start;
            start++;
        }
        return min;

    }
}