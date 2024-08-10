//LeetCode : 1672 : Richest customer wealth

//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in jth bank.
//Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all their bank accounts.
//The richest customer is the customer that has the maximum wealth.


//Example 1:
//
//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6
//Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//2nd customer has wealth = 3 + 2 + 1 = 6
//Both customers are considered the richest with a wealth of 6 each, so return 6.

public class Problem_020 {
    public static void main(String[] args){
        int[][] accounts = {
                {1,5},
                {7,3},
                {3,5}
        };
        int maxWealth = wealthCounter(accounts);
        System.out.println("Maximum wealth is : "+maxWealth);
    }
    static int wealthCounter(int[][] arr){
        if(arr.length == 0) return -1;
        int max = 0;
        for(int[] customer : arr){
            int sum =0;
            for(int bank : customer){
                sum += bank;
            }
            if(max < sum) max = sum;
        }
        return max;
    }
}
