public class SLL {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(45);
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertFirst(15);
        list.insertFirst(3);
        list.insertLast(99);
        list.insert(33, 3);

        // list.display();

        // System.out.println("\n"+list.deleteFirst());
        // list.display();

        // System.out.println("\n"+list.delete(2));
        // list.display();
        // System.out.println("\n"+list.deleteLast());
        // list.display();
        // list.insertRecursively(25, 3);
        // System.out.println();
        list.display();
        System.out.println();

        list.reverseLL();



    }
}
