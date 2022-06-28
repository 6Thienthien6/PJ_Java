package DSAList.Arraylist;

import java.util.LinkedList;

public class myListTest {
    public static void main(String[] args) {
        LinkedList<String> Cars = new LinkedList<>();
        Cars.add(0, "Lexus");
        Cars.add(1, "Mazda");
        Cars.add(2,"Huyndai");
        Cars.add(3,"Honda");
        Cars.add(4,"Yamaha");
        Cars.add(5,"BWM");
        Cars.add(6,"Bentley");
        Cars.add(7,"Mecrcedes");
        Cars.add(8,"Nissan GTR");
        Cars.add(9,"Kia");
        Cars.add(10,"Toyota");
        Cars.add(11,"Suzuki");
        Cars.add(11,"Nagasaki");
//        System.out.println("element:"+ Cars);
//        Cars.addFirst("Maruko chan");
//        System.out.println("full Element"+ Cars);
//        Cars.addLast("Shizuoka");
//        System.out.println("full"+ Cars);
        Cars.add(4, "MeowXinh");
        System.out.println(Cars);

    }
}
