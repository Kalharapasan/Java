package Second;

public class Demo {
    public static void main(String args[]) {
        LinkedList lst = new LinkedList();

        lst.insertBegining(7);
        lst.insertEnd(8);
        lst.insertEnd(10);
        lst.insertEnd(13);

        lst.insertAfter(10, 11);
        lst.search(10);
        lst.delete(20);
        lst.printL();
    }
}
