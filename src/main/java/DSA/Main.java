package DSA;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(22);
        list.insertFirst(12);
        list.insertFirst(69);
        list.insertFirst(7);
        list.insertFirst(4);

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertAtIndex(4,2);
        list.insertAtIndex(0,0);
        list.insertAtIndex(5,5);
        list.display();
        System.out.println(", deleted value "+list.deleteFirst());
        System.out.println();
        list.display();
        System.out.println(", deleted value "+ list.deleteLast());
        list.display();
        System.out.println(", deleted value "+ list.deleteAtIndex(0));
        list.display();
        System.out.println("index of given value = "+ list.findIndex(3));
        System.out.println("value of the given index = "+list.findValue(3));

        DoublyLL dlist = new DoublyLL();
        dlist.insertFirst(1);
        dlist.insertFirst(2);
        dlist.insertFirst(3);
        dlist.insertFirst(4);
        dlist.insertFirst(5);
        dlist.insertLast(6);
        dlist.insertLast(5);
        dlist.insertLast(4);
        dlist.insertLast(3);
        dlist.insertAtPosition(3,1);

        dlist.print();

    }
}
