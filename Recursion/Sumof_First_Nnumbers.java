package Recursion;
//Parameterized way
/* 
public class Sumof_First_Nnumbers {
    static void SumN(int i, int sum){
        if(i<1) {
            System.out.println(sum);
            return;
        }
        SumN (i-1,sum+i);
    }
    
    public static void main(String[] args) {
        int n = 3;
        SumN(n,0);
    }
}*/
//Functional way
public class Sumof_First_Nnumbers {
    static int SumN(int n){
        if(n == 0) {
            
            return 0;
        }
        return n + SumN (n-1);//SumN(n-1) calls new function SumN(2) i.e != 0 therefore return n+SumN(2-1) & again a func call for SumN(1)
    }
    
    public static void main(String[] args) {
        int n = 3;
        System.out.println(SumN(n));
    }
}