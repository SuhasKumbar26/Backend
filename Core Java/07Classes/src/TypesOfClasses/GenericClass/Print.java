package TypesOfClasses.GenericClass;

public class Print < T >{
    T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
