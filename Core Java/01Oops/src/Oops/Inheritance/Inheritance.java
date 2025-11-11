package Oops.Inheritance;

public class Inheritance {
    public static void main(String[] args) {
//        code reusability
//        child class can access their parent property and methods
//        types
//        1. single 2. multi level 3. hierarchical
//        Multiple is not allowed in java interface solves a diamond problem

        Car car = new Car();

        car.setColor("Blue");
        car.setSpeed(100);

        System.out.println(car.getColor());
        System.out.println(car.getSpeed());
    }
}
