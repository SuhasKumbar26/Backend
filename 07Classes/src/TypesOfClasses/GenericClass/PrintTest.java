package TypesOfClasses.GenericClass;

public class PrintTest {
    public static void main(String[] args) {
        Print<Integer> pObj = new Print<>();
        pObj.setValue(123);
        System.out.println(pObj.getValue());

//        RAW type internal System passes Object as Parameter
        Print rawType = new Print();
        rawType.setValue(1);
        System.out.println(rawType.getValue());
        rawType.setValue("Java");
        System.out.println(rawType.getValue());
    }
}
