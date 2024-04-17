package Recursion;

public class print1toNBacktracking {
    static void func(int i, int n){
        
        // Base Condition.
        if(i<1) return;
        
       // Function call to print i till i decrements to 1.
        func(i-1,n);//first function calls are executed till it satisfies the base condition then it prints through backtracking.
        System.out.println(i);

}
public static void main(String[] args) {

   // Here, let’s take the value of n to be 4.
   int n = 4;
   func(n,n);
}
}
