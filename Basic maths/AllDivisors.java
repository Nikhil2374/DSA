 /* 
import java.util.Scanner;

public class AllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++){
          if(n % i == 0){
            System.out.println("Divisors are : "+i);
          }
        }
    }
}*/
//optimal solution




public class AllDivisors{
		
	public static void main(String[] args){
		
		printDivisorsOptimal(36);
		
	}

	public static void printDivisorsOptimal(int n){
		
		System.out.println("The divisors of "+n+" are:");
		for(int i = 1; i <= (int)Math.sqrt(n); i++)
			if(n % i == 0){
				System.out.print(i + " ");
				if(i != n/i) System.out.print(n/i + " ");
			}
			
		System.out.println();
	}
	
}


