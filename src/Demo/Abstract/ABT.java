package Demo.Abstract;

import Demo.AbstractInterface.Barkable;

abstract class ABT {
    abstract void chay();
    static class Bicycle extends ABT{
        void chay(){
            System.out.println("Chạy hơi chậm...");
        }

    }
}
