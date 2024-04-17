package Recursion;
//Brute Force
/*class PrintNameNtimes {
    static int cnt = 0;
    static void print(){
        
         // Base Condition.
         if(cnt == 3 ) return;
         System.out.println("Nikhil Kumar");

         // Count incremented.
         cnt = cnt+1;
         print();

    }
    public static void main(String[] args) {
        print();
    }
    
}*/
//Optimal
class PrintNameNtimes {
    static void func(int i, int n){
        
        // Base Condition.
        if(i>n) return;
        System.out.println("Nikhil Kumar");

        // Function call to print till i increments.
        func(i+1,n);

}
public static void main(String[] args) {

   // Here, let’s take the value of n to be 4.
   int n = 4;
   func(1,n);
} 
}
// time coplexity  & space complexity = O(n)