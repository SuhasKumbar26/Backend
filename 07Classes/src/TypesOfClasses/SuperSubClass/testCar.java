package TypesOfClasses.SuperSubClass;

public class testCar {
    public static void main(String[] args) {
        Car audi = new Car();

        int carId = audi.carId;
        audi.carIsStarting();
        String engineType = audi.engineType;
        int noOfWheels =audi.getNoWheels();

        Vehicle supra = new Car();
        // parent can hold child reference

        // Object class is Superclass of all class

        Object obj1 = new Car();
        System.out.println(obj1.getClass());
    }
}
