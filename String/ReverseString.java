public class ReverseString{
    public static void main(String[] args){
        String s = "This is a input string";
        System.out.println(s);
        char[] crr = s.toCharArray();
        int start = -1, end = -1, n = s.length() -1, i;
        reverse(crr, 0, n);
        for(i = 0; i <= n; i++){
            if(crr[i] != ' '){
                if(start < 0){
                    start = i;
                    end = i;
                } else{
                    end = i;
                }
            } else {
               reverse(crr, start, end);
               start = -1;
               end = -1; 
            }
        }

        if(start >= 0 && end >= 0){
           reverse(crr, start, end);
        }
        System.out.println(new String(crr));


    }
    public static void reverse(char[] arr, int start, int end){
        char temp;
        while(start< end){
            temp = arr[start];
            arr[start]  = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
    }
}