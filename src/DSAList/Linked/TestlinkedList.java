package DSAList.Linked;

public class TestlinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(13);
        list.add(0, 88);
        list.add(1, 100);
        list.add(2, 140);
        list.add(3, 1330);
        list.add(4, 143330);
        list.add(5, 1402223);
        list.addLast(20939213);
        list.addFirst(11);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println(list.get(6));
        System.out.println(list.get(7));
        System.out.println("Vị trí của phẩn tử 20939213 là : " + list.indexOf(20939213));

        System.out.println("Vị trí của phẩn tử 11 là: " + list.indexOf(11));
        list.printList();

        System.out.println("xóa hộ :"+list.remove(1));
        list.printList();




    }
}
