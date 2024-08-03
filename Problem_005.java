//Count how many times 7 occurs in a given integer

import java.util.Scanner;
public class Problem_005 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int ans = counting(num);
            System.out.println("No. of times "+7+" is repeated is : "+ans);
        }
    }
    static int counting (int num){
        int count =0;
        while(num>0){
            int mod = num % 10;
            if(mod == 0) count ++;
            num = num/10;
        }
        return count;
    }
}
