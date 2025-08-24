package Basic;

public class Vehicle {
    // constructor can be Private
    // used in singleton factory design
    int vehNo;

    private Vehicle(int no){
        this.vehNo = no;
    }

    public static Vehicle getInstance(){
        return new Vehicle(45682);
    }
}
