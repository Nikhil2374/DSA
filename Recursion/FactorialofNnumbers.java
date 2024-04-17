package Recursion;

public class FactorialofNnumbers {
    static int Factorial(int n){
     if( n == 0) return 1;
     return n * Factorial(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Factorial(n));
    }
}
//Time Complexity & Space Complexity = O(n);