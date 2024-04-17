package Recursion;

import java.util.Scanner;

public class printNto1usingrecursion {
    static void print(int i ,int n){
     if (i ==  n) return;
     System.out.println(n);
     
     print(i,n-1);// call function print again by increasing value of i by 1 print(2,n) i.e: Recursion.

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        print(0,n);
    }
}
/*class printNto1usingrecurs {
    
    static void func(int i, int n){
        
            // Base Condition.
            if(i<1) return;
            System.out.println(i);

            // Function call to print i till i decrements to 1.
            func(i-1,n);

    }
    public static void main(String[] args) {

       // Here, let’s take the value of n to be 4.
       int n = 4;
       func(n,n);
    }
}
 */