//import java.util.Scanner;

class Pattern5 {
    static void pattern(int N)
 {
     // This is the outer loop which will loop for the rows.
     for (int i = 1; i <= N; i++)
     {
          // This is the inner loop which here, loops for the columns
         // as we have to print a rectangular pattern.
         for (int j = 0; j < N-i+1; j++)
         {
             System.out.print("*");
         }
 
          // As soon as N stars are printed, we move to the
         // next row and give a line break otherwise all stars
         // would get printed in 1 line.
         System.out.println();
     }
 }
 
     public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);  
            
          int N = 5;
          //in.close();
         // Here, we have taken the value of N as 5.
         // We can also take input from the user.
         

         pattern(N);
     }
 }