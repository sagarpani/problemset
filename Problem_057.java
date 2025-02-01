//string is palindrome

public class Problem_057 {
    public static void main(String[] args) {
        String str = "avgva";
        System.out.println(palindromeWhileLoop(str));
    }

    //String Builder Method
    /*static boolean palindromeStringBuilder(String str){
        if(str.isEmpty()) return true;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            builder.append(str.charAt(i));
        }
        return builder.reverse().toString().equals(str);
    }

    //Reverse a String
    static boolean palindromeReverseString(String str){
        if(str.isEmpty()) return true;
        String pox = "";
        for (int i = str.length()-1; i>=0; i--) {
            pox +=  str.charAt(i);
        }
        return str.equals(pox);
    }

    //char Array Method
    static boolean palindromeArrayMethod(String str){
        if(str.isEmpty()) return true;
        char[] newArr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            newArr[i] = str.charAt(str.length()-1-i);
        }
        System.out.println(Arrays.toString(newArr));
        String str2 = new String(newArr);
        return str2.equals(str);
    }

    //2 pointer method for loop (1 comparision extra)
    static boolean palindromeForLoop(String str){
        if(str.isEmpty()) return true;
        int end = str.length();
        for (int start = 0; start <= str.length()/2 ; start++) {
            if(str.charAt(start) != str.charAt(str.length()-1-start)){
                return false;
            }
        }
        return true;
    } */

    //2 pointer method while loop (1 comparision less)
    static boolean palindromeWhileLoop(String str) {
        if(str.isEmpty()) return true;
        int start = 0;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
