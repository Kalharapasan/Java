package first;
public class DemoLst {
    public static void main(String args[]) {
        Link_List lst = new Link_List();

        lst.insertAtEnd(lst, 6);
        lst.insertAtEnd(lst, 11);
        lst.insertAtEnd(lst, 4);

        lst.insertAtFront(lst, 10);

        //lst.insertAfter(6,17);
        lst.display(lst);
    }
}
