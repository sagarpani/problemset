//3 digit ARMSTRONG NUMBER : If sum of the cubes of all individual numbers in a num equals to that num itself then it is called as an armstrong num.
//QUESTION : Find out how many 3 digit ARMSTRONG numbers are there?

import java.util.Scanner;

public class Problem_009 {
public class Don{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Search limits");
            System.out.print("Start : ");
            int x = sc.nextInt();
            System.out.print("End : ");
            int y = sc.nextInt();
            int ans = armstrong(x,y);
            System.out.print("Total armstrong numbers are : "+ans);
        }

    }
    static int armstrong(int start, int end){
        int count=0;
        for(int i = start; i<=end; i++){
            int cube = 0;
            int number = i;
            while(number>0){
                int remainder = number % 10;
                cube += remainder * remainder * remainder;
                number = number / 10;
            }
            if(cube == i) count++;
        }
        return count;
    }

}
    
}
