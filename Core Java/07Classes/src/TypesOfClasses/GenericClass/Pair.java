package TypesOfClasses.GenericClass;

public class Pair<K, V>{
    private K key;
    private V val;

    public void put(K key, V val){
        this.key = key;
        this.val = val;
    }

    public void show(){
        System.out.println(key+" "+val);
    }
}
