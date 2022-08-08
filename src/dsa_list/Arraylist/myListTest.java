package dsa_list.Arraylist;

public class myListTest {


    public static void main(String[] args) {


        MyList<String> Cars = new MyList<>();
//        List<String> Cars= new ArrayList<>();
        Cars.add(0, "Lexus");
        Cars.add(1, "Mazda");
        Cars.add(2, "Huyndai");
        Cars.add(3, "Honda");
        Cars.add(4, "Yamaha");
        Cars.add(5, "BWM");
        Cars.add(6, "Bentley");
        Cars.add(7, "Mecrcedes");
        Cars.add(8, "Nissan GTR");
        Cars.add(9, "Kia");
        Cars.add(10, "Toyota");
        Cars.add(11, "Suzuki");
        Cars.add(12, "Nagasaki");

        Cars.add(4, "MeowXinh");
        System.out.println("Sau khi add:");
        for (int i = 0; i < Cars.size; i++) {
            System.out.println(Cars.get(i));
        }

        System.out.println("Element REMOVEEEEEEEE:" + Cars.remove(3));
        System.out.println("sau khi remove Element nào đó :");
        for (int i = 0; i < Cars.size; i++) {
            System.out.println(Cars.get(i));
        }
        Cars.contains("MeowcXinh");
        System.out.println("MeowXinh có ở trong mảng: True or Fasle: ");
        System.out.println(Cars.contains("MeowXinh"));
        System.out.println("Vị trí của Suzuki là: " + Cars.indexOf("Suzuki"));
        System.out.println("Vị trí thứ 11 là: " + Cars.get(11));
        System.out.println("Độ dài của mảng là : " + Cars.size());
    }
}
