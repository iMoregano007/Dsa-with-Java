import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,4,5,6,6,7};
        int size = nums.length;
        int[] nums1 = new int[size];

        int i =0, j=1, k =0;
        while(i< nums.length && j <nums.length){
           
            if(nums[i] == nums[j]){
                i++;
                j++;
            } else if(nums[i] != nums[j]){
                nums1[k] = nums[i];
                i = j;
                j++;
                k++;

            }
        }
         if(i == nums.length -1){
                nums1[k] = nums[i];
            }


        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums1));


    }
    
}
