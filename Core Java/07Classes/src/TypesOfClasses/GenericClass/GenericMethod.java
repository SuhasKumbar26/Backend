package TypesOfClasses.GenericClass;

public class GenericMethod {

    public <T> void display(T val){
        System.out.println(val);
    }

    public <K, V> void show(K key, V val){
        System.out.println("key:"+ key+" "+"val:"+val);
    }
}
