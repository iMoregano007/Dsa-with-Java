public class CheckPalindromeRec {
    public static boolean isPalindrome(String str, int i, int n){
        if(i >= n/2){
            return true;
        }
        if(str.charAt(i) != str.charAt(n-i-1)){
            return false;
        }

        return isPalindrome(str, i + 1, n);
    }

    public static void main(String[] args) {
        String str = "MADAM";
        System.out.println("Is String a Palindrome :");
        System.out.println(isPalindrome(str, 0, 0));
    }
}
