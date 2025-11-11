package Chaining;

public abstract class Vehicle {
    String type;
    int modelNo;

    Vehicle(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
