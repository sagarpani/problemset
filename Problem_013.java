//Does the array contain the desired element

import java.util.Scanner;
public class Problem_013 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[10];

            System.out.println("Enter 10 elements");
            for(int i = 0; i < 10; i++){
                arr[i] = sc.nextInt();
            }

            System.out.print("The number you're finding : ");
            int a = sc.nextInt();
            System.out.println("Does the array contain "+a+" : "+ans(arr,a));
        }
    }

    static boolean ans(int[] arr, int a){
       for(int element : arr){
           if(element == a) return true;
       }
        return false;
    }
}
