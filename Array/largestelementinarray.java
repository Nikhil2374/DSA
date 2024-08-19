package Array;
import java.util.Scanner;
//Brute force approach
/* 
import java.util.*;
public class largestelementinarray {
 
  public static void main(String args[]) {
 
    int arr1[] =  {2,5,1,3,0};
    System.out.println("The Largest element in the array is: " + sort(arr1));
   
    int arr2[] =  {8,10,5,7,9};
    System.out.println("The Largest element in the array is: " + sort(arr2));
  }
  static int sort(int arr[]) {
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }
}

*/
//Optimal approach
public class largestelementinarray {
    public static void array(int array[]){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            
            if(array[i]>max){
                max = array[i];
            }
            
        }
        System.out.print("Max element is : "+ max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array elements : ");
        int array[] = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        sc.close();
        array(array);
    }
}

