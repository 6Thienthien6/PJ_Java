package DSAList.Linked;

public class TestlinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(4);
        list.addLast(64);
        System.out.println(list.indexOf(64));
        list.add(1, 88);

        list.add(0,100);
        list.add(3,140);
        list.add(4,1330);
        list.add(5,143330);
        list.add(6,1402223);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println(list.get(6));



    }
}
