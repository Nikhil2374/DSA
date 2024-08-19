package Array;

public class checkifarrayissorted {
    public static boolean isSorted(int array[], int n){
        for(int i=1; i<n; i++){
           if(array[i]<array[i-1]){
            return false;
           }       
        }
        return true;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        int n = array.length;
        System.out.println(isSorted(array,n));
    }
}
