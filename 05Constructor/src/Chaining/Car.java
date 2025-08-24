package Chaining;

public class Car extends Vehicle{

    int carNo;

    Car(String type, int carNo) {
        super(type);
        this.carNo = carNo;
    }

    public int getCarNo(){
        return carNo;
    }
}
