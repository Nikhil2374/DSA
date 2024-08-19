package Array;

public class LinearSearch {
    public static int linearSearch(int n, int a[], int num) {
        for (int i = 0; i < n; i++) {
            if (a[i] == num) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int array[] = { 6, 7, 8, 4, 1 };
        int n = array.length;
        int num = 4;
        int ans = linearSearch(n, array, num);
        System.out.println("Element present at index : "+ans);
    }
}
