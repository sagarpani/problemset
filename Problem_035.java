//A basic Linear Search demonstration in a 2-D array 
//Given an 2-D array which is arr={ {18,9,12},{36,-4,91},{44,33,16} }; and target= 91.
//Find in which index the target resides in {row,column} format.

import java.util.Arrays;
public class Problem_035{
    public static void main(String[] args){
        int[][] arr={
                {18,9,12},
                {36,-4,91},
                {44,33,16}
        };
        int target=91;

        int[] ans = linearSearch(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] linearSearch(int[][] arr, int target){
        int end= arr.length-1;
        for(int i=0; i<=end; i++){
            for(int j=0; j<=arr[i].length-1; j++){
                if(arr[i][j] == target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}