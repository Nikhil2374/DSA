public class Reverseanumber {
    public static void main(String[] args) {
    int N = 123;
    int num = N;
    int reverse = 0;
    while(N!=0)
    {
        int digit = N%10;
        reverse = reverse*10+digit;
        N = N/10;
    }
    System.out.println("Given number:"+ num);
    System.out.println("Reverse number:"+reverse);
    }
}
