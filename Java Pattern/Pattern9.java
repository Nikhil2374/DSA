public class Pattern9 {
    static void pattern7(int n){

        for(int i = 0; i <= 5; i++){
            //for space
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }
            //for star
            for(int j = 0; j < 2*i+1; j++){
                System.out.print("*");
            }
            //for space
            //for(int j = 0; j < n-i-1; j++){
            //    System.out.print(" ");
            //}
            System.out.println(" ");
        }
    }
    static void pattern8(int n){
        for(int i=0; i<n; i++){
            for(int j=0;j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i; j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
        public static void main(String[] args) {
            pattern7(6);
            pattern8(6);
        }
        
}
