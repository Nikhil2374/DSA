package Array;

import java.util.Scanner;

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

