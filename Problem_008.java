//No. is prime or not

import java.util.Scanner;
public class Problem_008 {
     public static void main(String[] args){
         try (Scanner sc = new Scanner(System.in)) {
             System.out.print("Enter a no. : ");
             int n = sc.nextInt();
             if(isPrime(n)) System.out.println("A prime no.");
             else System.out.println("Not a prime no.");
         }
    }

    static boolean isPrime(int n){
        if(n<2) return false;
        if(n==2 || n ==3) return true;
        boolean ans = true;
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n % i == 0) {
                ans = false;
                break;
            }
        }
       return ans;
    }
  
}
