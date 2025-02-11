
public class Problem_059 {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        System.out.println(fibonacciByRecursion(6));
    }

    //Printing nth fibonacci number by using loop with constant space
    static int fibonacci(int n){
        if(n<=1) return n;
        int start = 0;
        int end = 1;
        for(int i = 2; i<= n; i++){
            int temp = start;
            start = end;
            end = end +  temp;
        }
        return end;
    }

    //Printing nth fibonacci number by using Recursion with variable space
    static int fibonacciByRecursion(int n){
        //Base Condition
        if(n<2) return n;
        return fibonacciByRecursion(n-1)+fibonacciByRecursion(n-2);
    }
}
