package Part1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionFrameworkBasic {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        // Iterator
        Iterator<Integer> listIterator = list.iterator();
        while (listIterator.hasNext()){
            int val = listIterator.next();
            System.out.println(val);
            if(val == 3){
                listIterator.remove();
            }
        }

        for( int l: list){
            System.out.println(l);
        }

        // forEach method
        list.forEach((Integer val) -> System.out.println(val));
    }
}
