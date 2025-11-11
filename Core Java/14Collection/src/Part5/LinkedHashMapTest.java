package Part5;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Character> linkedHashMap = new LinkedHashMap<>();
        System.out.println("Normal LinkedHashMap Insertion Order is maintained");
        linkedHashMap.put(11,'A');
        linkedHashMap.put(22,'B');
        linkedHashMap.put(31,'C');
        linkedHashMap.put(14,'D');
        linkedHashMap.forEach((Integer key, Character val)-> System.out.println(key+" : "+val));

        System.out.println("LinkedHashMap Access Order is maintained");
        LinkedHashMap<Integer,String> linkedHashMap1 = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap1.put(231, "A");
        linkedHashMap1.put(102, "B");
        linkedHashMap1.put(421, "C"); // frequently accessed
        linkedHashMap1.put(212, "D");
        linkedHashMap1.put(890, "E");

        linkedHashMap1.get(421);
        linkedHashMap1.get(212);
        linkedHashMap1.forEach((Integer key, String val) -> System.out.println(key+" : "+val));

        // Thread safe version
        Map<Integer,String> threadSafeVer = Collections.synchronizedMap(new LinkedHashMap<>());


    }
}
