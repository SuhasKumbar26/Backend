package Interface;

public interface InterfaceInfo {
        public static final int VAR_NAME = 20;
        // -> by default: " public static final "

        float AGE = 23;

        public abstract void fly();
        // ->> by default: "public abstract"

        String getAge();

        static void staticMethod(){
            privateStatic(); // -> private static helper
            // -> only access static methods
            // can't be inherited
            // called via interface name ex: InterfaceInfo.staticMethod()
        }

        default void name(){
            // -> it can be overridden.
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
