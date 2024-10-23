//Binary Search In 4x4 sorted matrix
//Given a 2D sorted array arr = {{ 1, 2, 3, 4},{ 5, 6, 7, 8},{ 9,10,11,12},{13,14,15,16}} and target 19. Find in which index the target value resides with a time complexity O(log(nxn)).

import java.util.Arrays;
public class Problem_037{
    public static void main(String[] args){
        int[][] arr = {
                { 1, 2, 3, 4},
                { 5, 6, 7, 8},
                { 9,10,11,12},
                {13,14,15,16}
        };
        int target = 19;
        int finalRow = search(arr,target);
        if(finalRow == -1){
            System.out.println("There is no such element found");
            return;
        }
        int finalColumn = binarySearch(arr[finalRow], target,0, arr[0].length-1);
        if(finalColumn == -1){
            System.out.println("There is no such element found");
        }
        int[] ans = {finalRow, finalColumn};
        System.out.println("Element found at index : "+Arrays.toString(ans));
    }
    static int search(int[][] arr, int target){
        int endCol = arr[0].length-1;
        int startRow = 0;
        int endRow = arr.length-1;
        while(endRow >= startRow){
            int mRow = startRow + (endRow - startRow)/2;
            int ele = arr[mRow][endCol];
            if(ele == target) return mRow;
            else if(ele < target) startRow = mRow + 1;
            else endRow = mRow - 1;
        }
        if(startRow < arr.length) return startRow;
        return -1;
    }
    static int binarySearch(int[] arr, int target, int startCol, int endCol){

        while(endCol >= startCol){
            int mid = startCol + (endCol - startCol)/2;
            if(arr[mid] == target) return mid;
            else if (arr[mid] > target) endCol = mid - 1;
            else startCol = mid + 1;
        }
        return -1;
    }
} 