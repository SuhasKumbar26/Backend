package TypesOfClasses.GenericClass.WildCard;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        PrintSet printSet = new PrintSet();

        List<Vehicle> vehicleList = new ArrayList<>();
        printSet.setValues2(vehicleList);

        List<Bus> busList = new ArrayList<>();
//        printSet.setValues2(busList);
//        printSet.setValues(busList);


    }
}
