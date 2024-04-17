package Recursion;
//Multiple Recursion calls
public class Fibonacci {
    static int fibonacci(int N){
        
        // Base Condition.
        if(N <= 1){
            
            return N;
        }
        //Fibonacci(N) = Fibonacci(N-1) + Fibonacci(N-2)
        // Problem broken down into 2 functional calls
        // and their results combined and returned.
        int last = fibonacci(N-1);
        int slast = fibonacci(N-2);
        
        return last + slast;
        

}
public static void main(String[] args) {

   // Here, let’s take the value of N to be 4.
   int N = 4;
   System.out.println(fibonacci(N));
}
}
