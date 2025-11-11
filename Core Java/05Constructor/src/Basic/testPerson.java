package Basic;

public class testPerson {
    public static void main(String[] args) {
        Person obj = new Person(123);

        Vehicle vehObj = Vehicle.getInstance();
        System.out.println(vehObj.vehNo);
    }
}
