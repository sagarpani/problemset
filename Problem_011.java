//Find Maximum value Present in this array

import java.util.Scanner;
public class Problem_011{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = {2,3,4,5,6};
            int ans = max(arr);
            System.out.println("The maximum value present in this array is : "+ans);
            System.out.println("Enter values for max range");
            System.out.print("Start : ");
            int start = sc.nextInt();
            System.out.print("End : ");
            int end = sc.nextInt();
            System.out.println("The max value between start and end index is : "+maxRange(arr,start,end));
        }
    }
    static int max(int[] arr){
        if(arr.length == 0) return -1;
        int max = Integer.MIN_VALUE;
        for(int element : arr){
            if(element > max) max = element;
        }
        return max;
    }
    static int maxRange(int[] arr,int start, int end){
        if(start>end) return -1;
        if(arr == null) return -1;
        int maxVal = Integer.MIN_VALUE;
        for(int i =start; i<=end; i++){
            if(arr[i]>maxVal) maxVal = arr[i];
        }
        return maxVal;
    }
}