

public class InsertionLL {

    // Class Of Node
    public static class Node {
        // Instance Variables of Node
        int data; //Stores value of the node
        Node next; //stores address of the next node

        //Constructor of the Node which initializes the Node with data and sets address as null
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Class of Linked list -- Every ll has head, tail and null which points towards tail
    public static class LinkedList {
        Node head = null ;// represents first node of the ll which is null
        Node tail = null ;// represents last node of the ll which is null

        // insertAtEnd method to insert a new node at the end of the list
        public void insertAtEnd(int value) {
            Node OurNewNode = new Node(value); //creates new node with the value
            // If LL is empty, head and tail will be the new node
            if (head == null) {
                head = OurNewNode;
                tail = OurNewNode;
            } else {
                // For Non Empty List: Existing tail, which currently points to null, will now point to the new node
                tail.next = OurNewNode; //current tail point karay gaa new node kai address ko
                tail = OurNewNode; //Tail is updated to the new node
            }
        }

        // insertAtStart method to insert a new node at the beginning of the list
        public void insertAtStart(int value) {
            Node OurNewNode = new Node(value);
            if (head == null) {
                head = OurNewNode;
                tail = OurNewNode;
            } else {
                // For Non Empty list: The new node points to the current head and then becomes the new head
                OurNewNode.next = head;
                head = OurNewNode;
            }
        }

        // Method to display the linked list
        public void display() {
            Node temp = head; //starts with the head of the LL / the head updates itself
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next; //Moves towards next node
            }
        }
        
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtStart(0);
        ll.display();
    }
}
