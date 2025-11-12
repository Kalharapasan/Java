package first;

public class Linkedlist{
    Node head;

    public Linkedlist insert(Linkedlist list,int dt){
        Node newnode == new Node(dt);
        if(list.head == null){
            list.head = newNode;
        }else{
            Node last = list.head;

            while(last.next != null){
                last = last.next;

            }
            last.next =newNode;
        }
        return list;
    }

    public void insertAtFront(Linkedlist list.int dta){
        Node nNode = new Node(dta);

        nNode.next = head;
        head = nNode;
    }

    public void insertAfter(int after,int value){
        Node nNode = new Node(value);

        if(head == null){
            System.out.println("You can use insert after method.");
        }else{
            Node crntNode = head;
            while(crntNode.next != null){
                if(crntNode.data == after){
                    nNode.next = crntNode.next;
                    crntNode.next = nNode;
                }
            }

        }
    }

    public void display(Linkedlist lst){
        Node crntNode = head;

        while(crntNode != null){
            System.out.println(crnNode.data +" ");
            crntNode = crntNode.next;
        }
    }
}