package Part2;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTemp {
    public static void main(String[] args) {
        ArrayList<Emp> emps = new ArrayList<>();

        emps.add(new Emp("Suhas", "636669078", 160));
        emps.add(new Emp("Pratap", "36669078", 10));
        emps.add(new Emp("Smith", "54889089", 80));

        System.out.println(emps);
        Collections.sort(emps, new phoneComparator());
        System.out.println(emps);
        Collections.sort(emps, new nameComparator());
        System.out.println(emps);

        Collections.sort(emps, (Emp o1, Emp o2) -> o2.getId() - o1.getId());
        System.out.println(emps);
    }
}
