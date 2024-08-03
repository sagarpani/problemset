//Print nth fibonacci no.

import java.util.Scanner;

public class Problem_004{
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("The no. of digits you want to print : ");
        int x = sc.nextInt();
        if(x==1) System.out.println(0);
        if(x==2) System.out.println(1);
        if(x>2) {
            int a = 0;
            int b = 1;
            for (int i = 3; i <= x; i++) {
                int temp = b;
                b = a + b;
                a = temp;
            }
        System.out.println(b);
        sc.close();
        }
    }
}