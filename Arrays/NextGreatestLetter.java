public class NextGreatestLetter{
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'd';

        System.out.println(solu(letters, target));
 
    }

    static char solu(char[] letters, char target){
        int start = 0, end = letters.length-1, mid;
        while(start<=end){
            mid =  (start + end)/2;
            // if(target >= letters[end]){
            //     return letters[0];
            // }
            // if(target == letters[mid]){
            //     return letters[mid+1];
            // } else 
            if( target > letters[mid]){
                start = mid+1;
            } else if( target < letters[mid]) {
                end = mid -1;
            }
        }

        return letters[start%letters.length];
    }
}