package Chaining;

public class testCar {
    public static void main(String[] args) {
       Car car = new Car("Zxr",2564);

        //int carNo = car.carNo;
        int no = car.getCarNo();
        System.out.println(car.type);
        System.out.println(car.carNo);
        String str = car.getType();
    }
}
