package FunctionalInterface.TypesOfFunImpl;

public class FunctionTest {

    public static void main(String[] args) {

        Function<Integer, String> function = (Integer val) ->{
            if(val % 2 == 0) return "Even";
            else return "Odd";
        };

        System.out.println(function.guessEvenOrOdd(123));
        System.out.println(function.guessEvenOrOdd(12));
    }
}
