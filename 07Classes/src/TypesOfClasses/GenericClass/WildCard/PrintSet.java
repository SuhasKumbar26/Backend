package TypesOfClasses.GenericClass.WildCard;

import java.util.List;

public class PrintSet {

    public void setValues1(List<Vehicle> vehicleList){

    }

    // UpperBound
    public void setValues2(List<? extends Vehicle> vehicleList){

    }

    // LowerBound
    public void setValues3(List<? super Vehicle> vehicleList){

    }

    // UnBound
    public void setValues4(List<?> vehicleList){

    }
}
