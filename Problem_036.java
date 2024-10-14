//Searching in 2D arrays with time complexity O(n).
//Given a matrix arr as  { {10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,42,50} } which is a 4X4 matrix and a target 28.
//Find out in which index does this target reside.

//Given that the matrix is sorted both row wise and column wise

import java.util.Arrays;
public class Problem_036 {
     public static void main(String[] args){
        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,42,50}
        };
        int target=28;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr, int target){
        int row=0;
        int col= arr.length-1;
        while(row < arr.length && col >=0){
            int element = arr[row][col];
            if(element == target ) return new int[]{row,col};
            else if(element > target) col--;
            else row++;
        }
        return new int[]{-1,-1};
    }
}
