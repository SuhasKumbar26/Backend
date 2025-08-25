package FunctionalInterface.TypesOfFunImpl;

public class ProducerTest {
    public static void main(String[] args) {
        Producer<String> producer = (String name) ->{
            if(name.equalsIgnoreCase("java")) return "Same same";
            else return "No Nope";
        };

        System.out.println(producer.apply("java"));
        System.out.println(producer.apply("Jav"));
    }
}
