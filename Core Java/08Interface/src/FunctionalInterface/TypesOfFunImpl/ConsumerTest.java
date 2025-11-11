package FunctionalInterface.TypesOfFunImpl;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (Integer val) ->{
            if(val > 10) System.out.println("Greater than 10");
            else System.out.println("Smaller than 10");
        };

        consumer.process(124);
    }
}
