public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] array = {20,20,25,36,36,1,1,6,8,9,12,15};
        int target = 36;
        int result = rBSearch(array, target);
        if(result == -1){
            System.out.println("Target not found.");
        } else {
            System.out.println("Target found at index :"+ result);
        }
    }
    // for distinct elements
    static int rotatedBSearch(int[] array, int target){
        int start = 0, end = array.length-1,mid;
        while(start<=end){
            mid = start + (end - start)/2;
            if(array[mid] == target){
                return mid;
            }

            if(array[start] < array[mid]){
                if(target >= array[start] && target < array[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                if(target > array[mid] && target <= array[end]){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        
        return -1;
    }

    // for duplicate elements
    static int rBSearch(int[] array, int target){
        int start = 0, end = array.length-1,mid;
        while(start<=end){
            mid = start + (end - start)/2;
            if(array[mid] == target){
                return mid;
            } 
            if(array[start] == array[mid] && array[mid] == array[end]){
                start++;
                end--;
                continue;
            }

            if(array[start] < array[mid]){
                if(target >= array[start] && target < array[mid]){
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                if(target > array[mid] && target <= array[end]){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        
        return -1;
    }
}
