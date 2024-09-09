package Array;
/*
//Brute force approach
public class FindNumberAppearOnceAndTheOtherTwice {
    public static int getSingleElement(int []arr) {
        // Size of the array:
        int n = arr.length;

        //Run a loop for selecting elements:
        for (int i = 0; i < n; i++) {
            int num = arr[i]; // selected element
            int cnt = 0;

            //find the occurrence using linear search:
            for (int j = 0; j < n; j++) {
                if (arr[j] == num)
                    cnt++;
            }

            // if the occurrence is 1 return ans:
            if (cnt == 1) return num;
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {4,4,5,5,6,6,7,8,8};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}
 */
//Better approach 1:
 //USing Hashing:
 /* 
 public class FindNumberAppearOnceAndTheOtherTwice {
    public static int getSingleElement(int []arr) {
        //size of the array:
        int n = arr.length;

        // Find the maximum element:
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        // Declare hash array of size maxi+1
        // And hash the given array:
        int[] hash = new int[maxi + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        //Find the single element and return the answer:
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1)
                return arr[i];
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
 }

*/
//Better approach 2:
//Using HashMap:
/* 
import java.util.*;

public class FindNumberAppearOnceAndTheOtherTwice {
    public static int getSingleElement(int []arr) {
        // Size of the array:
        int n = arr.length;

        //Create a HashMap:
        HashMap<Integer, Integer> map = new HashMap<>();

        //Run a loop for selecting elements:
        for (int i = 0; i < n; i++) {
            int num = arr[i]; // selected element

            //if the element is not present in the map:
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        //Iterate over the map:
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {4,4,5,5,6,6,7,8,8};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }


}
    */

//Optimal approach:
//Using XOR:
public class FindNumberAppearOnceAndTheOtherTwice {
    public static int getSingleElement(int []arr) {
        //size of the array:
        int n = arr.length;

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}