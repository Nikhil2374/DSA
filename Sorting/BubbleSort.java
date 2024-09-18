package Sorting;

import java.util.Scanner;

public class BubbleSort {

    static void bubble_sort(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        // Create an array of size n
        int[] arr = new int[n];
        
        // Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Display the array before sorting
        System.out.println("Before Using Bubble Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // Call the bubble sort function
        bubble_sort(arr, n);
        
        // Display the array after sorting
        System.out.println("After Using Bubble Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
