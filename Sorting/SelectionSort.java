package Sorting;

import java.util.Scanner;

public class SelectionSort {
    static void Selection_Sort(int arr[],int n){
        for (int i = 0; i <=n - 2; i++) {
            int mini = i;
            for (int j = i; j <= n-1; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            //swap
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Selection_Sort(arr,n);
        sc.close();
    }
}
