public class CustomStack{
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    
    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    private int ptr = -1;
    public boolean push(int val) {
        if(isFull()){
            System.out.println("Stack is Full!!");
            return false;
        }

        ptr++;
        data[ptr] = val;
        return true;
    }


    public int pop(){
        if(isEmpty()){
           System.out.println("Stack is Empty!!"); 
           return -1;   
        }

        return data[ptr--];
    }


    private boolean isEmpty() {
        if(ptr ==  -1){
            return true;
        }

        return false;
    }

    private boolean isFull() {
        if(ptr == data.length -1){
            return true;
        }

        return false;
    }
}