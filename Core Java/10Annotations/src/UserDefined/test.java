package UserDefined;

public class test {
    public static void main(String[] args) {
        Class EagleClass = Eagle.class;
        System.out.println(EagleClass.getAnnotation(MyCustomAnnotation.class));

        Class BirdClass = Bird.class;
        System.out.println(BirdClass.getAnnotation(MyCustomAnnotation.class));
    }
}
