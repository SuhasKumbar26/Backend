package Part6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    //public static final int ava = 120;
    public static void main(String[] args) {
        // HashSet
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(123);
        hashSet.add(13);
        hashSet.add(19);
        hashSet.add(110);

        hashSet.forEach((Integer val) -> System.out.println(val));

        // LinkedHashSet, insertion order is maintained
        Set<Integer> linkedHashSet = new LinkedHashSet<>(16,0.75f);
        linkedHashSet.add(123);
        linkedHashSet.add(13);
        linkedHashSet.add(19);
        linkedHashSet.add(110);

        System.out.println("Linked hash set");
        linkedHashSet.forEach((Integer val) -> System.out.println(val));

        // treeSet , sorted
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(123);
        treeSet.add(13);
        treeSet.add(19);
        treeSet.add(110);
        System.out.println("Tree set");
        treeSet.forEach((Integer val) -> System.out.println(val));
    }
}
