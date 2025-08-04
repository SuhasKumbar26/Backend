package Oops.Encapsulation;

public class Car {
    private int carNo;
    private String carModel;
    private String color;

    Car(int carNo, String carModel, String color){
        this.carNo = carNo;
        this.carModel = carModel;
        this.color = color;
    }

    public int getCarNo() {
        return carNo;
    }

    public String getCarModel(){
        return carModel;
    }

    public String getColor(){
        return color;
    }

    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
