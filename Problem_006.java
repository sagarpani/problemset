//Reverse of an integer

import java.util.Scanner;
public class Problem_6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter new no. : ");
            int num = sc.nextInt();
            int ans = reverse(num);
            System.out.print("Reverse of the given no. is :"+ans);
        }
    }
    static int reverse (int num){
        int remainder,ans=0;
        while(num>0){
            remainder = num % 10;
            ans = ans * 10 + remainder;
            num = num / 10;
        }
        return ans;
    }
}

