import java.util.Arrays;

public class ReverseArrayRec {
    public static void reverseRec(int i, int[] arr, int n){
        if(i >= n/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n - i -1];
        arr[n-i-1] = temp;
        reverseRec( i +1 , arr, n);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println("Original Array \n"+ Arrays.toString(arr));
        reverseRec(0, arr, n);
        System.out.println("Reversed Array \n"+ Arrays.toString(arr));
    }
}
