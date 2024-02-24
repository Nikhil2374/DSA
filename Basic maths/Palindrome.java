public class Palindrome {
    public static void main(String[] args) {
    int N = 121;
    int num = N;
    int reverse = 0;
    while(N!=0)
    {
        int digit = N%10;
        reverse = reverse*10+digit;
        N = N/10;
    }
    if(num == reverse){
        System.out.println("Yes Palindrome");
    }else{
        System.out.println("Not Palindrome");
    }
    }
}
