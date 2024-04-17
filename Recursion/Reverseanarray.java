package Recursion;
//Simple method
/* 
public class Reverseanarray {
    static void Rev(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i<j){
        int t = arr [i];
        arr [i] = arr [j];
        arr [j] = t;
        i++;
        j--;
        }
    }
    public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
    for(int i =0; i<arr.length ; i++){
        System.out.print(arr[i]+" ");
    }
    Rev(arr);
    for(int i =0; i<arr.length ; i++){
        System.out.print(arr[i]+" ");
    }
    }
}*/

//method 2

/* 
public class Reverseanarray {
//Function to print array
static void printArray(int arr[], int n) {
    System.out.print("Reversed array is:- \n");
    for (int i = 0; i < n; i++) {
       System.out.print(arr[i] + " ");
    }
 }
 //Function to reverse array 
 static void reverseArray(int arr[], int n) {
    int p1 = 0, p2 = n - 1;
    while (p1 < p2) {
       int tmp = arr[p1];
       arr[p1] = arr[p2];
       arr[p2] = tmp;
       p1++;
       p2--;
    }
    printArray(arr, n);
 }
 public static void main(String[] args) {
    int n = 5;
    int arr[] = { 5, 4, 3, 2, 1};
    System.out.print("Given array is:- \n");
    for (int i = 0; i < n; i++) {
       System.out.print(arr[i] + " ");
    }System.out.println("\n");
    reverseArray(arr, n);

 }
}
*/

//Using Recursion

public class Reverseanarray {
    //Function to print array
    static void printArray(int arr[], int n) {
       System.out.print("Reversed array is:- \n");
       for (int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
       }
    }
    //Function to reverse array using recursion
    static void reverseArray(int arr[], int start, int end) {
       if (start < end) {
          int tmp = arr[start];
          arr[start] = arr[end];
          arr[end] = tmp;
          reverseArray(arr, start + 1, end - 1);
       }
    }
    public static void main(String[] args) {
       int n = 5;
       int arr[] = { 5, 4, 3, 2, 1};
       reverseArray(arr, 0, n - 1);
       printArray(arr, n);
    }
 }