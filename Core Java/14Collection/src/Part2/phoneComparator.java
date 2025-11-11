package Part2;

import java.util.Comparator;

public class phoneComparator implements Comparator<Emp> {
    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getPhone().compareTo(o2.getPhone());
    }
}
