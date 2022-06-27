package DSAList.SimpleList;

public class TestMylist {
    public static void main(String[] args) {
        Mylist<Integer> integerlist = new Mylist<>();
        integerlist.add(1);
        integerlist.add(2);
        integerlist.add(3);
        integerlist.add(4);
        integerlist.add(6);
        System.out.println("Phần tử số 3: " + integerlist.get(3));
        System.out.println("element 4 : "+ integerlist.get(0));
        System.out.println("Phần tử thứ 2: "+ integerlist.get(1));
        System.out.println("element 6 : " +integerlist.get(2) );

        integerlist.get(-1);
        System.out.println("Phần tử -1: " +  integerlist.get(-1));


    }

}
