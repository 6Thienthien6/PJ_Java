package DSAList.Linked;


public class LinkedList<E> {
    private Node head;
    private int numNode ;

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public LinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, E data) {
        if(index==0){
            addFirst(data);
            return;
        }
        if (index >= numNode){
            addLast(data);
            return;
        }
        Node temp = head;
        Node holder;
        for (int i = 0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNode++;
    }


    public void addFirst(E data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNode++;
    }

    public void addLast(E data) {
        if (head == null)
            addFirst(data);

        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
            numNode++;
            return;
        }
    }

    public int remove(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        assert temp.next != null;
        temp.next = temp.next.next;
        numNode--;
        return index;
    }



    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < numNode && temp.next != null; i++) {
            if (i == index) {
                return (E) temp.getData();
            }
            temp = temp.next;
        }

        return null;
    }

    public void size() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        System.out.println(i);
    }

    public boolean contains(Object data) {
        Node temp = head;
        for (int i = 0; i <= numNode; i++) {
            if ((temp.data).equals(data)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        Node temp = head;
        for (int i = 0; i < numNode; i++) {
            if (temp.getData().equals(e)) {
                return i;
            }
            temp = temp.next;
        }
        return numNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
