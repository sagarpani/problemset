//Find ceiling of a number in a sorted array

//Ceiling of a number = number which is immediately greater than or equals to the given key number

public class Problem_024 {
    public static void main(String[] args){
        int[] arr = {2,5,6,8,12,16,23,45};
        int num = 15;
        int ans = ceiling(arr, num);
        if(ans == Integer.MIN_VALUE) System.out.println("Error");
        else System.out.println("The ceiling number of "+num+" is : "+ans);
    }
    static int ceiling(int[] arr, int num){
        int n = arr.length;
        int lim = Integer.MIN_VALUE;

        //edge cases
        if(n == 0) return lim;
        if(num <= arr[0]) return arr[0];
        if(num > arr[n-1]) return lim;

        int start = 1;
        int end = n-1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] == num) return arr[mid];
            else if(arr[mid] < num) start = mid + 1;
            else end = mid;
        }
        return arr[start];
    }
}
