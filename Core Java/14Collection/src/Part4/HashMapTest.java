package Part4;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Sug");
        map.put(2,"Be");
        map.put(4,"Pro");
        map.put(1,"Peace");
        map.put(0,"Boat");

        System.out.println(map); // {1=Peace, 2=Be, 4=Pro}

        map.putIfAbsent(null,"String");
        map.putIfAbsent(0,"Sug");

        System.out.println(map);

        // isEmpty()
        System.out.println("IsEmpty(): "+map.isEmpty());
        // size()
        System.out.println("size(): "+map.size());
        // containsKey()
        System.out.println("ContainsKey(): "+map.containsKey(2));
        // containsValue()
        System.out.println("ContainsValue(): "+map.containsValue("Pro"));
        // get()
        System.out.println("get(2): "+map.get(2));
        // getOrDefault()
        System.out.println("getOrDefault(): "+map.getOrDefault(9,"Default"));
        // remove()
        System.out.println("remove(): "+map.remove(null));

        System.out.println(map);

        // Entry<Integer, String>
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println("Value: "+entry.getValue());
            System.out.println("key: "+entry.getKey());
        }
        System.out.println();

        // keySet()
        for(Integer integer: map.keySet()){
            System.out.println("key: "+integer);
        }

        // valueSet()
        Collection<String> valueSet = map.values();
        for (String s : valueSet) {
            System.out.println("Value: "+s);
        }
    }
}
