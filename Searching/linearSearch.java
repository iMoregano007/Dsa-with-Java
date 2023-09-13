public class linearSearch{
    public static void main(String[] args) {
        int[] array = {12,25,3,6,5,9,14,28};
        int target = 25;
        int resultIndex = search(array,target);
        if(resultIndex == -1){
            System.out.println("Target not found in the Array");
        } else {
            System.out.println("Target found at index :"+resultIndex);
        }
    }
    static int search(int[] array, int target){
        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                return i;
            }
        }
        
        
        return -1;
    }
}