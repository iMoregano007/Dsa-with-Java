public class RecursionExample {

    public static void recFunc(int i){
        if(i < 1){
            return;
        }
        System.out.println("Naam Bataiye?");
        System.out.println("Bhupendra Jogi");
        System.out.println("US me knha knha gye hai?");
        System.out.println("US me bahut jagah gaya hoon.");
        recFunc(i-1);
    }

    public static void main(String[] args) {
        System.out.println("Calling Bhupendra Jogi func 5 times.");
        recFunc(5);
    }
}
