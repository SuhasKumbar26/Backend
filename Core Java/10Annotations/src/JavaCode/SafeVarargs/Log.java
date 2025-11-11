package JavaCode.SafeVarargs;

import java.util.ArrayList;
import java.util.List;

public class Log {

    @SafeVarargs
    public final void printList(List<Integer>... integerList){
        Object[] objectList = integerList;

        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        objectList[0] = stringList;
    }
}
