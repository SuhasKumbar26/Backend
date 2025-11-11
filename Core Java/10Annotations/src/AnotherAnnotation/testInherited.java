package AnotherAnnotation;

public class testInherited {
    public static void main(String[] args) {
        System.out.println(ChildClass.class.getAnnotation(MyCustomAnnotation.class));
    }
}
