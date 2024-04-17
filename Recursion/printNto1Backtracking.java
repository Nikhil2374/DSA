package Recursion;

public class printNto1Backtracking {
    static void func(int i, int n){
        
        // Base Condition.
        if(i>n) return;
        

        // Function call to print i till i decrements to 1.
        func(i+1,n);
        System.out.println(i);

}
public static void main(String[] args) {

   // Here, let’s take the value of n to be 4.
   int n = 4;
   func(1,n);
}
}
