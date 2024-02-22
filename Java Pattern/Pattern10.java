public class Pattern10 {
    
        static void pattern1(int N)
     {
         
         for (int i = 0; i < N; i++)
         {
        
             for (int j = 0; j < i; j++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }
     }
     static void pattern2(int N)
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
        pattern1(6);
        pattern2(6);
    }
}
