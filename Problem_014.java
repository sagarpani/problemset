//Linear Search

public class Problem_014 {
    public static void main(String[] args) {
        int[] arr = {18,12,9,14,77,50};
        int a = 14;
        int ans = linearSearch(arr,a);
        if(ans == -1) System.out.println("There is no such element");
        else System.out.println("The element is present at index : "+ans);
    }

    static int linearSearch(int[] arr, int a){
        if(arr.length ==0) return -1;
       for(int i =0; i<arr.length; i++){
           if(arr[i] == a) return i;
       }
        return -1;
    }
}
