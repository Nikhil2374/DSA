/*package Array;

import java.util.Scanner;

public class Secondlargestelementinarray {
    public static void array(int array[]) {
        int secondmax= array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            
            if (array[i] > max) {
                secondmax = max;
                max = array[i];
            }

        }
        System.out.print("Secoond max element is : " + secondmax);
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
}*/
package Array;

import java.util.Scanner;

public class Secondlargestelementinarray {
    public static void array(int array[]) {
        if (array.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondmax = max;
                max = array[i];
            } 
             else if (array[i] > secondmax && array[i] != max) {
                secondmax = array[i];
            }
        }

        if (secondmax == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (array may have all identical elements).");
        } else {
            System.out.println("Second max element is: " + secondmax);
            System.out.println("Max element is: " + max);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array elements:");
        int array[] = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        sc.close();
        array(array);
    }
}

