package Second;

public class LinkedList {
    Node head;

    public void insertBegining(int data) {
        Node newNode = new Node(data);  //name of the node-newNode

        if ( head == null) {  // check the list is empty or not
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(int after, int value) {
        Node newNode = new Node(value); // make a node
        if ( head == null) {//check linkedlist is empty or not
            System.out.println("List is Empty");
            return;
        }

        Node current = head;

        while(current != null) {
            if(current.data == after) {
                newNode.next = current.next;
                current.next = newNode;
            }
            current = current.next;
        }
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if(head == null ) { //check head is null or not
            System.out.println("List is empty");
            return;
        }
        Node last = head; // check where is the end(find last list)
        while (last.next != null) {
            last = last.next;
        }
        last.next=newNode;
    }

    public void search(int target) {
        if(head == null) { //check head is null or not
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            if(current.data == target) {
                System.out.println("Element is found");
            }
            current = current.next;
        }
    }

    public void delete(int key) { // key is delete element
        if(head == null ) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        Node previous = null;
        while (current != null) {
            if (current.data == key) {
                previous.next = current.next;
                break;
            }
            previous = current;
            current = current.next;
        }
    }
    public void printL() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("LinkedList is:");

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

}
