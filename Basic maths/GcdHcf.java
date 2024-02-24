/*Euclidean Algorithm
gcd(n1,n2) = gcd (n1-n2 , n2)  where  n1 > n2;
eg:
gcd(20,15) = gcd (5,15) 
gcd (15, 5) = gcd (10,5)  = gcd(5,5) = gcd(0,5)
thertefore gcd = 5; 
or 20%15 --> 5,15   then  15%5 ---->  0,5  hence non zero 5 is gcd
therefore
n1 % n2 ----> 0  non zero will be gcd

time complexity =  O(logɸmin(a,b)), where ɸ is 1.61.
O(logɸmin(a,b)), where ɸ is 1.61.
*/
//Brute Force 
public class GcdHcf {
    public static void main(String args[]) {
        int num1 = 9, num2 = 12;
        int ans = 1;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
          if (num1 % i == 0 && num2 % i == 0) {
            ans = i;
          }
        }
        System.out.print("The GCD of the two number is "+ans);
      }
}


/* 
public class GcdHcf {
    static int gcd(int a, int b) {
      if (b == 0) {
        return a;
      }
      return gcd(b, a % b);
    }
    public static void main(String args[]) {
      int a = 12, b = 6;
      int ans = gcd(a, b);
      System.out.print("The GCD of the two numbers is "+ans);
    }
  }
  */
  
