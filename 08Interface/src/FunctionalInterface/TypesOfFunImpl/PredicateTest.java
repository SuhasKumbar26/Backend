package FunctionalInterface.TypesOfFunImpl;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (Integer val) -> {
            if (val > 2) return true;
            else return false;
        };

        System.out.println(predicate.guessNo(456));
        System.out.println(predicate.guessNo(-9));
    }
}
