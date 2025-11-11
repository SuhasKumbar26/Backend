import java.lang.reflect.Modifier;

public class testReflection {

    public static void main(String[] args) throws ClassNotFoundException {
        // .class
        Class birdObj = Bird.class;

        // forName
        Class birdObj2 = Class.forName("Bird");

        // getClass
        Bird bird = new Bird();
        Class birdObj3 = bird.getClass();


        System.out.println(birdObj2.getName());
        System.out.println(Modifier.toString(birdObj2.getModifiers()));


    }
}
