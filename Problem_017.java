 // Maximum and minimum elements in the array

public class Problem_017 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,7,4,3,2,56,4,32};

        int max = maxim(arr);
        int min = minim(arr);
        System.out.println("Minimum : "+min);
        System.out.println("Maximum : "+max);
    }

    static int maxim(int[] arr){

        //Here we can add if(arr.length==0) return -1; if the array is dynamic not static.

        int max = Integer.MIN_VALUE;
        for(int a : arr){
            if(a>max) max = a;
        }
        return max;
    }
    static int minim(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int a : arr){
            if(a<min) min = a;
        }
        return min;
    }
}
