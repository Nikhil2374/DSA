package Array;

//Brute Force Approach
/* 
public class LeftRotateTheArrayByDPlaces {
static void leftRotateByD(int array[], int n, int k) {
    int temp[] = new int[k];
    for (int i = 0; i < k; i++) {
      temp[i] = array[i];
    }
    //for Shifting the elements to left
    for (int i = k; i < n; i++) {
      array[i - k] = array[i];
    }
    //for adding the elements from temp array to the end of the array
    for (int i = 0; i < k; i++) {
      array[n - k + i] = temp[i];
    }

}

public static void main(String args[]) {
    int n = 7;
    int[] arr = {1,2,3,4,5,6,7};
    int k = 2;
    leftRotateByD(arr, n, k);
    System.out.println("After Rotating the elements to left ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
}
}
*/
//Optimized Approach
public class LeftRotateTheArrayByDPlaces {

    public static void reverse(int array[], int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotateByD(int array[], int n, int k) {
        reverse(array, 0, k - 1);
        reverse(array, k, n - 1);
        reverse(array, 0, n - 1);
    }

    public static void main(String args[]) {
        int n = 7;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;
        leftRotateByD(arr, n, k);
        System.out.println("After Rotating the elements to left ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}