package Part3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(0,100);
        list1.add(200);
        list1.add(1,300);
        list1.add(2,400);

        list1.forEach((Integer val) -> System.out.println(val));

        List<Integer> list2 = new ArrayList<>();
        list2.add(0,-200);
        list2.add(-800);
        list2.add(1,-300);
        list2.add(2,-400);

        list1.addAll(2,list2);

        System.out.println("After adding All");
        list1.forEach((Integer val) -> System.out.println(val));

        System.out.println("After unaryOperator");
        list1.replaceAll((Integer val) -> {
            if (val < 0) return val * -1;
            return val;
        });

        list1.forEach((Integer val) -> System.out.println(val));

        System.out.println("Sorting: ");
        list1.sort((Integer n1, Integer n2)-> n2-n1);
        list1.forEach((Integer val) -> System.out.println(val));

        System.out.println("Get index");
        System.out.println(list1.get(2));

        System.out.println("Set index");
        list1.set(2,1000);
        list1.forEach((Integer val) -> System.out.println(val));

        System.out.println("remove");
        list1.remove(Integer.valueOf(1000));
        list1.forEach((Integer val) -> System.out.println(val));

        System.out.println("IndexOf: ");
        System.out.println(list1.indexOf(200));
        System.out.println("IndexOf: ");
        System.out.println(list1.lastIndexOf(200));

        // ITERATOR
        // forward
        ListIterator<Integer> listIterator1 = list1.listIterator();
        while (listIterator1.hasNext()){
            int val = listIterator1.next();
            System.out.println("Forward: "+val+" nextIndex: "+listIterator1.nextIndex()+" previousIndex: "+listIterator1.previousIndex());
            if (val == 200){
                listIterator1.add(2000);
            }
        }
        list1.forEach((Integer val) -> System.out.println(val));

        // backward direction
        ListIterator<Integer> listIteratorBack = list1.listIterator(list1.size());
        while (listIteratorBack.hasPrevious()){
            int val = listIteratorBack.previous();
            System.out.println("Backward: "+val+" nextIndex: "+listIteratorBack.nextIndex()+" previousIndex: "+listIteratorBack.previousIndex());
            if (val == 2000){
                listIteratorBack.set(1000);
            }

        }
        list1.forEach((Integer val) -> System.out.println(val));


        // SubList anyChanges in Sublist effect on an original list
        List<Integer> subList = list1.subList(4,8);
        System.out.println("Sublist form 4 to 8: ");
        subList.forEach((Integer v1)-> System.out.println(v1));

    }
}
