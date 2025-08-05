package WrapperClass;

public class wrapper {
    public static void main(String[] args) {
        // to convert primitive data type to referenced type
        Integer a = 23;
        System.out.println(a); // 23
        modify(a);
        System.out.println(a); // 23



//        no change bcz Integer -> is immutable once created can't be changed
    }

    public static void modify(Integer n){
        n = 12;
    }
}
