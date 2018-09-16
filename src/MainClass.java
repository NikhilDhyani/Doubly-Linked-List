public class MainClass {

    public static void main(String[] args) {

        DoublyLinkedList ll = new DoublyLinkedList();

        ll.insert(8);
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);

        ll.insertAt(3,101);

        ll.insertAt(1,999);

        ll.insertAt(0,777);


        ll.insertAt(0,666);


        ll.show();

    }
}
