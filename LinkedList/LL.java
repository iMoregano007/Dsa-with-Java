public class LL{

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
    }

    public void insert(int val, int index){
        Node temp = head;
        
        for(int i = 1; i <index; i++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        if(head == null){
            head = tail;
        }

    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("END");
    }


    public class Node{
        private int value;
        private Node next;


        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;

        }

    }

}