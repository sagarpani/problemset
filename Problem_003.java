//Input a character and print whether that character is Uppercase or Lowercase letter

import java.util.Scanner;
public class Problem_003 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a character :");

            char ch = sc.next().trim().charAt(0);

            if('a'<=ch && ch<='z') System.out.println("This is a lowercase letter");

            else if('A'<=ch && ch<='z') System.out.println("This is an uppercase letter");
            
            else System.out.println("Invalid input");
        }
    }
}
