import java.util.Scanner;

class countdigits{
    static int count_digits(int n)
    {
        //type casting 
       int digits = (int) Math.floor(Math.log10(n) + 1);
        return digits;
    }
    /*static int count_digits(int n){
        int x = n; int count = 0;
        while (x!=0) {            
            x=x/10;
            count++;
        }return count;
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digits : ");
        int a = sc.nextInt();
        sc.close();
        int n = a;
        System.out.println(count_digits(n));
    }
}
//time comlexity = O(log10(n)) devision of n by 10 i.e time coplexity based on devision are log