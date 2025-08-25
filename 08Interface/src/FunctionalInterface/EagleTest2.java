package FunctionalInterface;

public class EagleTest2 {
    public static void main(String[] args) {
        Bird birdObj = new Bird() {
            @Override
            public void getBirdName() {
                System.out.println("I'm in Anonymous Inner class");
            }
        };

        birdObj.getBirdName();
    }
}
