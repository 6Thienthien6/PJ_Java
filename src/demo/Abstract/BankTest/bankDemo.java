package demo.Abstract.BankTest;

public class bankDemo {
        public static void main(String args[]){
            BankIllusion bankbane;
            bankbane = new Viettin() {
            };
            System.out.println("Lãi suất Viettinbank 1 năm là: "+bankbane.layLaiSuat()+" %");
            bankbane = new Vietcom(){

            };
            System.out.println("Lãi suất Vietcombank 1 năm là : "+bankbane.layLaiSuat()+" %");
        }
}
