//Pattern Series

public class Problem_058 {
    public static void main(String[] args){
        System.out.println("Pattern1");
        pattern1(5);
        System.out.println("Pattern2");
        pattern2(5);
        System.out.println("Pattern3");
        pattern3(5);
        System.out.println("Pattern4");
        pattern4(5);
        System.out.println("Pattern5");
        pattern5(5);
        System.out.println("Pattern6");
        pattern6(5);
        System.out.println("Pattern7");
        pattern7(5);
        System.out.println("Pattern8");
        pattern8(5);
        System.out.println("Pattern9");
        pattern9(5);
        System.out.println("Pattern10");
        pattern10(5);
        System.out.println("Pattern11");
        pattern11(5);
        System.out.println("Pattern12");
        pattern12(5);
    }
    static void pattern1(int n){
        //No. of rows, I want to print
        for (int rows = 1; rows <= n ; rows++) {
            //No. of columns, I want to print for each row
            for (int cols = 1; cols <= n ; cols++) {
                //what is print
                System.out.print("* ");
            }
            //Once a row is successfully printed, go for a new line
            System.out.println();
        }
    }
    static void pattern2(int n){
        //No of rows, I want to print
        for (int rows = 1; rows <= n ; rows++) {
            //No. of columns, I want to print per each row
            for (int col = 1; col <= rows ; col++) {
                //what to print
                System.out.print("* ");
            }
            //After one row is successfully printed, then I have to move to a new line
            System.out.println();
        }
    }
    static void pattern3(int n){
        //No. of rows, I want to print
        for (int row = 1; row <= n ; row++) {
            //No. of columns, I want to print per row
            for (int cols = 1; cols <= n-row+1 ; cols++) {
                //What to print
                System.out.print("* ");
            }
            //Go for a new line
            System.out.println();
        }
    }
    static void pattern4(int n){
        //No. of rows, I want to print
        for (int rows = 1; rows <= 5 ; rows++) {
            //No. of cols, I want to print for each row
            for (int cols = 1; cols <= rows ; cols++) {
                //What to print
                System.out.printf("%d ",cols);
            }
            //Go for a new line
            System.out.println();
        }
    }
    static void pattern5(int n){
        //No. of rows, I want to print
        for (int rows = 1; rows <= n+n-1 ; rows++) {
            //No. of cols, I want to print
            //Till n = 5, no. of col would be equal to no. of rows
            //From n = 6 till the end no. of columns would be reduced by 1 for each further row
            int totalColumns = rows<=n ? rows : 2*n-rows-1;
            for (int cols = 1; cols <= totalColumns; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        //No. of rows, I want to print
        for (int rows = 1; rows <= n ; rows++) {
            //No. of inner loops
            for (int cols = 1; cols <= n ; cols++) {
                //the catch is what to print but where to print
                if(cols > n-rows){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        //No. of rows, I want to print
        for (int rows = 1; rows <= n ; rows++) {
            //No. of columns, I want to print and where to print
            for (int cols = 1; cols <= n ; cols++) {
                //Where to print
                if(cols >= rows){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //Pyramid1
    static void pattern8(int n){
        //No. of rows, you want to print
        for (int rows = 0; rows < n; rows++) {
            //No. of cols, you want to print
            for (int cols = 1; cols <= n+rows ; cols++) {
                //where to print
                if(cols >= n-rows){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //Pyramid2
    static void pattern9(int n){
        //No. of rows, I want to print
        for (int rows = 1; rows <= n; rows++) {
            //No. of cols, I want to print
            for (int cols = 1; cols <= 2*n-rows; cols++) {
                //where to print
                if(cols >= rows){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    //Pyramid3
    static void pattern10(int n){
        //No. of rows, I want to print
        for (int rows = 1; rows <= n ; rows++) {
            //No. of inner loops
            for (int cols = 1; cols <= n ; cols++) {
                //the catch is what to print but where to print
                if(cols > n-rows){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //pyramid4
    static void pattern11(int n){
        //No. of rows
        for (int rows = 1; rows <= n; rows++) {
            //No. of cols
            for (int cols = 1; cols <= n; cols++) {
                if(cols >= rows){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    //watch glass pyramid
    static void pattern12(int n){
        int key = n;
        // No. of rows
        for (int rows = 1; rows <= 2 * n; rows++) {

            //No. of cols
            if(rows <= n){
                for (int cols = 1; cols <= n; cols++) {
                    if(cols >= rows){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            else{
                for (int cols = 1; cols <= n; cols++) {
                    if(cols >= key){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                key--;
            }
            System.out.println();
        }
    }
}
