public class Pattern7 {
    static void pattern(int n){

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
public static void main(String[] args) {
    pattern(5);
}}
