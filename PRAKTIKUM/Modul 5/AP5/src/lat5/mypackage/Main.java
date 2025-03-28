package lat5.mypackage;

import lat5.enkapsulasi.Car;

public class Main {
    public static void main(String[] args) {
        MyClass.sayHello();

        Car myCar = new Car();
        System.out.println(myCar.kapasitas);
        System.out.println(myCar.getMerk()); 
        // System.out.println(myCar.pemilik);
    }
}