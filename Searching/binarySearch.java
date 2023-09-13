public class binarySearch {
    public static void main(String[] args) {
        int[] array = {2,5,6,7,12,15,19,22};
        int target = 12;
        if(bSearch(array, target)){
            System.out.println("Target is found in Array.");
        } else {
            System.out.println("Target is not found in Array.");
        }

    }

    static boolean bSearch(int[] array, int target){
        
        int start =0, end = array.length -1, mid;
        while(start<=end){
            mid = start + (end - start)/2;
            if(array[mid] == target){
                return true;
            } else if(target > array[mid]){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return false;
    }
}
