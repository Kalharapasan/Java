package first;
public class Link_List {
    Node head;

    public Link_List insertAtEnd(Link_List list, int dt) {
        Node NewNode = new Node(dt);
        if(list.head == null) {  // check head available or not
            list.head = NewNode; // create head node
        } else {  // find last node
            Node last = list.head; // assign head node is last

            while (last.next != null) {
                last = last.next;
            }
            last.next = NewNode;
        }
        return list;

    }

    public void insertAtFront(Link_List list, int dta) {
        Node nNode = new Node(dta);

        nNode.next = head;
        head = nNode;
    }

//    public void insertAfter(int after, int value) {
//        Node nNode = new Node(value);
//
//        if ( head == null) {
//            System.out.println("You can't use insertAfter method");
//        } else {
//            Node crntNode = head;
//            while (crntNode.next != null) {
//                if(crntNode.data == after) {
//                    nNode.next = crntNode.next;
//                    crntNode.next = nNode;
//                }
//            }
//        }
//    }
    public void display(Link_List lst) {
        Node crntNode = head;

        while(crntNode != null) {
            System.out.println(crntNode.data + " ");
            crntNode = crntNode.next;
        }
    }
}
