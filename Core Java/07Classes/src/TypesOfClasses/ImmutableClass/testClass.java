package TypesOfClasses.ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class testClass {
    public static void main(String[] args) {
        List<Object> petNames = new ArrayList<>();
        petNames.add("Dog");
        petNames.add("Cat");

        MyImmutableClass myImmutableClass = new MyImmutableClass("Java",petNames);

        System.out.println(myImmutableClass.getName());

        List<Object> objects = myImmutableClass.getPetList();
        System.out.println(objects);
        objects.add("Tiger");

        System.out.println(myImmutableClass.getPetList());
    }
}
