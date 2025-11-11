package TypesOfClasses.GenericClass;

public class BoundedTest {
    public static void main(String[] args) {
        Bounded<Integer> bounded = new Bounded<>();
        bounded.setValue(123);
        System.out.println(bounded.getValue());

//        Bounded<String> str = new Bounded<String>();
//        Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number
    }
}
