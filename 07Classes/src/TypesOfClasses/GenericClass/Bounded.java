package TypesOfClasses.GenericClass;

public class Bounded <T extends Number>{
    T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
