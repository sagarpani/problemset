//Building a calculator problem. Here I've build in which you can use 5 different operators which are +, -, *, /, % .
//The program will exit if you type 'x' or 'X'.

import java.util.Scanner;
public class Problem_007 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while(true) {
                System.out.println("Enter the operator : ");
                char ch = sc.next().trim().charAt(0);
                
                if(ch == 'x' || ch == 'X') break;
                
                else {
                    int ans =0;
                    System.out.println("Enter two numbers : ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    switch (ch) {
                        case '+' -> ans = a + b;
                        case '-' -> ans = a - b;
                        case '*' -> ans = a * b;
                        case '/' -> {
                            if (b == 0) System.out.println("Undefined");
                            else ans = a / b;
                        }
                        case '%' -> {
                            if (b == 0) System.out.println("Undefined");
                            else ans = a % b;
                        }
                        default -> System.out.println("Undefined");
                    }
                    System.out.println("Ans is "+ans);
                }

            }
        }
    }
    
}
