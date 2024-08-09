//Linear search in 2-D array

import java.util.Arrays;

public class Problem_018 {
    public static void main(String[] args){
        int[][] arr = {
                {1, 2, 4},
                {9, 2, 3, 4},
                {9, 7, 6}
        };
        int ele = 6;
        int[] ans = search(arr, ele);

        if (Arrays.equals(ans,new int[]{-1,-1})) System.out.println("Code not found");

        else System.out.println("Element found at index : "+Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int ele){
        if(arr.length == 0) return new int[]{-1,-1};
        for (int row = 0; row < arr.length; row++) {
            for( int col =0; col<arr[row].length; col++){
                if(arr[row][col] == ele) {
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};

    }
}
