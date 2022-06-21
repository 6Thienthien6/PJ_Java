package Demo.Abstract;

public class bankDemo {
        public static void main(String args[]){
            BankIllusion bankbane;
            bankbane = new viettin() {
            };
            System.out.println("Lãi suất: "+bankbane.layLaiSuat()+" %");
            bankbane = new vietcom();
            System.out.println("Lãi suất: "+bankbane.layLaiSuat()+" %");
        }
}
