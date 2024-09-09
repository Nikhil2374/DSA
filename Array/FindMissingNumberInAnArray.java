package Array;



//Brute force approach
/* 
public class FindMissingNumberInAnArray {   
    public static int missingNumber(int []a, int N) {

        // Outer loop that runs from 1 to N:
        for (int i = 1; i <= N; i++) {

            // flag variable to check
            //if an element exists
            int flag = 0;

            //Search the element using linear search:
            for (int j = 0; j < N - 1; j++) {
                if (a[j] == i) {

                    // i is present in the array:
                    flag = 1;
                    break;
                }
            }

            // check if the element is missing
            //i.e flag == 0:

            if (flag == 0) return i;
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }

}

*/
//Better approach
/* 
import java.util.HashSet;
public class FindMissingNumberInAnArray {
    public static int missingNumber(int[] a, int N) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i = 0; i < N - 1; i++) {
            hs.add(a[i]);
        }
        for (int i = 1; i <= N; i++) {
            if (!hs.contains(i)) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = { 1, 2, 4, 5 };

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }

}
    */

//Optimal approach
//XOR approach
/* 
public class FindMissingNumberInAnArray {
    public static int missingNumber(int[] a, int N) {
        int x1 = a[0];
        int x2 = 1;

        for (int i = 1; i < N - 1; i++) {
            x1 = x1 ^ a[i];
        }

        for (int i = 2; i <= N; i++) {
            x2 = x2 ^ i;
        }

        return (x1 ^ x2);
    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = { 1, 2, 4, 5 };

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }

}
    */
//Sum approach
public class FindMissingNumberInAnArray {
    public static int missingNumber(int[] a, int N) {
        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            sum += a[i];
        }
        int total = N * (N + 1) / 2;
        return total - sum;
    }

    public static void main(String args[]) {
        int N = 5;
        int a[] = { 1, 2, 4, 5 };

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }

}
