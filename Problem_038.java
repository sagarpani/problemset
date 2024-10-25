//Binary Search in nxn matrix with serial approach
//Given a nxn matrix arr={{1,2,3}, {4,5,6}, {7,8,9}} and a target=5.
//So check it out whether the element is present in the matrix or not.
//Do it by serial approach

public class Problem_038{
    public static void main(String[] args){
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target = 3;
        boolean ans = binarySearch(arr, target);
        if(ans) System.out.println("Element is found");
        else System.out.println("Element is not found");

    }
    static boolean binarySearch(int[][] arr, int target){
        int row = arr.length;
        if(row==0) return false;

        int col = arr[0].length;

        int low = 0;
        int high = row * col -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int midValue = arr[mid / col] [mid % col];

            if(midValue == target) return true;
            else if(midValue < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}