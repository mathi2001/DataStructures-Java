package DSA;

public class DoublyLL {
    Node head;
    Node prev;
    public void insertFirst(int val){
        Node node = new Node(val);

            node.next = head;
            node.prev = null;
            if(head != null){
                head.prev = node;
            }
            head = node;
    }
    public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node node = new Node(val);
        temp.next = node;
        node.prev = temp;
        node.next = null;
    }
    public void insertAtPosition(int after, int value){
        Node temp = head;
        while (after != temp.value){
            temp = temp.next;
        }

        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public void print(){
        Node temp = head;
        Node last = null;
        while (temp != null){
            System.out.print(temp.value+" ");
            last = temp ;
            temp = temp.next;
        }
        System.out.println();
        while (last != null){
            System.out.print(last.value+" ");
            last = last.prev;
        }
    }
    private class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
