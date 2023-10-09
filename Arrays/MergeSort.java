import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int start, int end){
        if(start >= end)
            return;

        int mid = (start + end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end){
        int left = start, right = mid+1, index=0;
        int[] temp = new int[end - start +1];
        while(left <= mid && right <= end){
            if(arr[left] <= arr[right]){
                temp[index++] = arr[left++];
            } else{
                temp[index++] = arr[right++];
            }
        }
        while(left <= mid){
            temp[index++] = arr[left++];
        }
        while(right <= end){
            temp[index++] = arr[right++];
        }

        for(int i = start; i <= end ; i++){
            arr[i] = temp[i - start];
        }
    }


    public static void main(String[] args) {
        int[] arr = {5,8,6,3,2,4,7};
        mergeSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
