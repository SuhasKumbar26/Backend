package Interface;

public interface Bird {
    public static final int VAR_NAME = 20;
    // -> by default: " public static final "

    float AGE = 23;

    public abstract void fly();
    // ->> by default: "public abstract"

    String getAge();

    static void staticMethod(){
        privateStatic(); // -> private static helper
        // -> only access static methods
    }

     default void name(){
        privateStatic(); // -> private static helper
        privateMethod(); // -> private defaultMethod helper
        System.out.println("I'm in default defaultMethod");
     }

     private static void privateStatic(){
         System.out.println("I'm private static defaultMethod");
         // ->> works as a helper defaultMethod for Static methods
     }

    private  void privateMethod(){
        System.out.println("I'm private defaultMethod");
        // ->> works as a helper defaultMethod for methods
    }
}
