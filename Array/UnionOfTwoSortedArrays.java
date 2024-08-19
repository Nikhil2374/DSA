package Array;

import java.util.HashSet;
//Brute force approach
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

//Optimal approach