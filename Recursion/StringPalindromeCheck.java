package Recursion;

public class StringPalindromeCheck {
    static boolean func(int i, String s){
     if (i>=s.length()/2) return true;
     if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
     return func(i+1,s);
    }
    public static void main(String[] args) {
        String s ="MadaMab";
        System.out.println(func(0, s));
    }
}
