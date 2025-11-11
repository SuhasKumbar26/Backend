package TypesOfClasses.ImmutableClass;

import java.util.ArrayList;
import java.util.List;


public final class MyImmutableClass {
    private final String name;
    private final List<Object> petList;

    MyImmutableClass(String name, List<Object> petList){
        this.name = name;
        this.petList = petList;
    }

    public String getName(){
        return name;
    }

    public List<Object> getPetList(){
        return new ArrayList<>(petList);
//        return petList;
    }

}
