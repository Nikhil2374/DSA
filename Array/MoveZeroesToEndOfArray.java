package Array;



//Bruute Force Approach
/* 
public class MoveZeroesToEndOfArray {
    public static int[] moveZeros(int n, int a[]){
        //temporary array:
        ArrayList<Integer> temp = new ArrayList<>();
        //copy non-zero elements
        //from original -> temp array:
        for (int i = 0; i < n; i++) {
            if (a[i] != 0)
                temp.add(a[i]);
        }

        // number of non-zero elements.
        int nz = temp.size();

        //copy elements from temp
        //fill first nz fields of
        //original array:
        for (int i = 0; i < nz; i++) {
            a[i] = temp.get(i);
        }

        //fill rest of the cells with 0:
        for (int i = nz; i < n; i++) {
            a[i] = 0;
        }
        return a;
    }


    public static void main(String[] args) {
        int array[] = { 1, 0, 2, 0, 3, 0, 4, 5, 0, 6, 7, 0, 8, 9 };
        int n = array.length;
        int[] ans = moveZeros(n, array);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }



}*/
//Optimized Approach
public class MoveZeroesToEndOfArray {

    public static int[] moveZeros(int n, int[] a) {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                j++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        /* Eliminating the first loop
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                if (i != j) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
         */
        return a;
    }

    public static void main(String[] args) {
        int array[] = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        int n = array.length;
        int[] ans = moveZeros(n, array);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
}