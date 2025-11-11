package Part5;

import java.util.*;

public class TreeMapTest {
    public static void main(String[] args) {
        Map<Integer, String> integerMap = new TreeMap<>();
        integerMap.put(150,"A");
        integerMap.put(115,"B");
        integerMap.put(85,"C");
        integerMap.put(8,"D");
        integerMap.put(98,"E");

        integerMap.forEach((Integer key, String val) -> System.out.println(key+" : "+val));

        Map<Integer,String> StringMap = new TreeMap<>();
        StringMap.put(123,"Ejk");
        StringMap.put(176,"Bsf");
        StringMap.put(190,"Ehi");
        StringMap.put(111,"Str");

        List<Map.Entry<Integer,String>> entryList = new ArrayList<>(StringMap.entrySet());
//        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        entryList.sort(Map.Entry.comparingByValue((s1,s2) -> s2.compareTo(s1)));

        for (Map.Entry<Integer,String> entry : entryList){
            System.out.print(entry.getKey()+" : "+entry.getValue()+" ");
        }
    }
}
