package Part3;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();
        vector.add(200);
        vector.add(400);
        vector.add(1, 200);
        System.out.println(vector);
    }
}
