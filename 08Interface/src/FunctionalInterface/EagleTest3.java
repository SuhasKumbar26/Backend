package FunctionalInterface;

public class EagleTest3 {
    public static void main(String[] args) {
        Bird birdObj = () -> System.out.println("Get Your bird here");

        birdObj.getBirdName();
    }
}
