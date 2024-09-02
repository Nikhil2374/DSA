package Array;

//Brute force approach
/* 
import java.util.HashSet;
public class UnionOfTwoSortedArrays {
    static int[] Union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        int[] Union = new int[set.size()];
        
        int j = 0;
        for (int x : set) {
            Union[j++] = x;
        }
        return Union;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 1, 2, 2, 2, 3, 3};
        int arr2[] = {2, 3, 4, 5, 6, 7, 8};
        
        int[] result = Union(arr1, arr2);  

        System.out.println("The array after removing duplicate elements is:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
*/
//Optimal approach

import java.util.*;

class UnionOfTwoSortedArrays {
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0; // pointers
        ArrayList<Integer> Union = new ArrayList<>(); // Uninon vector
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else // case 3
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }

    public static void main(String args[]) {
        int n = 10, m = 7;
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union)
            System.out.print(val + " ");
    }
}

// Time complexity: O(n+m)
