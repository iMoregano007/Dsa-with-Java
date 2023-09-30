public class LL{

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }
    
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        
        if(head.next == null){
            tail = head;
        }
        size--;
        return val;
    }

    public Node get(int index){
        Node node = head;
        for(int i = 0; i< index; i++){
            node = node.next;
        }

        return node;
    }
    
    public int delete(int index){
        if(index == 0){
            deleteFirst();
        }

        Node node = get(index -1);
        int val = node.next.value;
        node.next = node.next.next;
        size--;
        return val;

    }

    public int deleteLast(){
        if(size <= 1){
            deleteFirst();
        }
        Node node = get(size - 2);
        int val = node.next.value;
        tail = node;
        tail.next = null;
        size--;
        return val;
    }

    public void insertRecursively(int val, int index){
        Node tmp = head;
        insertRec(val, index -1, tmp);
        size++;
    }

    private void insertRec(int val, int index, Node node){
        if(index < 1){
            Node n = new Node(val, node.next);
            node.next = n;
            return;
        }

        insertRec(val, index -1, node.next);
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insert(int val, int index){
        Node temp = head;
        
        for(int i = 1; i <index; i++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        if(head == null){
            head = tail;
        }
        size++;

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