package TypesOfClasses.GenericClass;

public class InheritTest {
    public static void main(String[] args) {
        Inherit<Integer> obj = new Inherit<>();
        obj.setValue(123);
        System.out.println(obj.getValue());
    }
}
