//package first;

import first.Linkedlist;

public class DemoLst{
    public static void main(String[] args){
        Linkedlist lst = new Linkedlist();

        lst.insertAtEnd(lst, 6);
        lst.insertAtEnd(lst, 11);
        lst.insertAtEnd(lst, 9);
        lst.InserAtFront(lst,12);
        lst.insertAfter(6,17);
        lst.display(lst);
    }
}