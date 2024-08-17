//Find Floor of a number in a sorted array

//Floor of a number = number which is immediately smaller than or equals to the given key number

public class Problem_025 {
    public static void main(String[] args){
        int[] arr = {2,5,6,8,12,16,23,45};
        int num = 21;
        int ans = Floor(arr, num);
        if(ans == Integer.MAX_VALUE) System.out.println("Error");
        else System.out.println("The Floor number of "+num+" is : "+ans);
    }
    static int Floor(int[] arr, int num){
        int n = arr.length;
        int lim = Integer.MAX_VALUE;

        //edge cases
        if(n == 0) return lim;
        if(num < arr[0]) return lim;
        if(num >= arr[n-1]) return arr[n-1];

        int start = 0;
        int end = n-2;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == num) return arr[mid];
            else if(arr[mid] < num) start = mid+1;
            else end = mid-1;
        }
        return arr[end];
    }
}
