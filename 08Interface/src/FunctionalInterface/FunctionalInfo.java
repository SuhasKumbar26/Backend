package FunctionalInterface;

@FunctionalInterface
public interface FunctionalInfo {
    // -> only one public abstract method is allowed
    void sayHello();

    static String getString(){
        return "Java 23";
    }

    default void defaultMethod(){
        System.out.println("default defaultMethod");
    }

}
