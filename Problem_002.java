//The largest among 3 no.s 

import java.util.Scanner;
public class Problem_002 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 3 no.s :");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int max = x;
            if(y>max) max = y;
            if(z>max) max = z;
            System.out.println("The largest no. is : "+max);
        }
    }
}