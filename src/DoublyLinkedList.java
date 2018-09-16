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
            System.out.println(x.data + " The previous is " + x.previous);

        }
        while (x.next != null) {

            System.out.println(x.data + " The previous is " + x.previous);

            x = x.next;
        }

        System.out.println(x.data + " The previous is " + x.previous);

    }


    public void insertAt(int position, int data) {
        int x = 0;
        Node tempNext;

        Node tempPrevious;

        Node node = new Node();

        node.next = null;

        node.previous = null;

        Node n = head;

        if (position == 0) {
            node.next = head;
            node.data = data;

            head.previous = node;

            head = node;


        }

        while (n.next != null) {
            if (x == position - 1) {
                node.data = data;

                tempNext = n.next;

                tempPrevious = n;

                node.next = tempNext;

                node.previous = tempPrevious;

                n.next = node;

            }
            x = x + 1;

            n = n.next;
        }

    }
}
