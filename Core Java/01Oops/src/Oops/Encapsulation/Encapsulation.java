package Oops.Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
//        bundles the data and code working (method) into a single unit;
//        Achieved through
//        declaring class variable as private
//        providing public GETTER and SETTER
        Car suzuki = new Car(1009, "2009MH","Black");

        System.out.println(suzuki.getCarModel());

        suzuki.setColor("White");

        System.out.println(suzuki.getColor());
    }
}
