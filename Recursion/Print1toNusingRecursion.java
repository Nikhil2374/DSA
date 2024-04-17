package Recursion;

import java.util.Scanner;

public class Print1toNusingRecursion {
    static void print(int i ,int n){
     if (i>n) return;
     System.out.println(i);
     
     print(i+1,n);// call function print again by increasing value of i by 1 print(2,n) i.e: Recursion.

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        print(1,n);
    }
}
