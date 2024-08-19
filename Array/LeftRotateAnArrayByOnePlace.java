package Array;

public class LeftRotateAnArrayByOnePlace {
  static void leftRotateByOne(int array[], int n) {
    int temp = array[0];
    for (int i = 1; i < n; i++) {
      array[i - 1] = array[i];
    }
    array[array.length - 1] = temp;
    System.out.println("Array after left rotation by one place");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }


    public static void main(String[] args) {
        int array[] = { 1, 1, 2, 2, 2, 3, 3 };
        int n = array.length;
        leftRotateByOne(array, n);
}
}
