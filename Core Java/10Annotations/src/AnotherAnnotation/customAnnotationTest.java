package AnotherAnnotation;

public class customAnnotationTest {
    public static void main(String[] args) {
        System.out.println(customAnnotation.class.getAnnotation(MyCustomAnnotation.class));
    }
}
