public class DoublyLinkedList {

    Node head;

    public void insert(int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;
        node.previous = null;

        if (head == null) {
            head = node;


        } else {

            Node n = head;

            while (n.next != null) {

                n = n.next;

            }

            n.next = node;
            node.previous = n;


        }

    }


    public void show() {


        Node x = head;

        if (x.next == null) {
            System.out.println(x.data + " The previous is "+ x.previous);


        }
        while (x.next != null) {

            System.out.println(x.data + " The previous is "+ x.previous);

            x = x.next;
        }

        System.out.println(x.data + " The previous is "+ x.previous);

    }
}
