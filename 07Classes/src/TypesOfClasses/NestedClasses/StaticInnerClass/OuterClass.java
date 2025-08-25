package TypesOfClasses.NestedClasses.StaticInnerClass;

public class OuterClass {
    int var;
    static int ID;

    static class nestedInnerClass{
        public void print(){
            System.out.println("Im in nestedInnerClass...");
        }
    }

    private static class NestedPrivateClass{
        public void display(){
            System.out.println("I'm private nested class...");
        }
    }

    public void show(){
        NestedPrivateClass obj = new NestedPrivateClass();
        obj.display();
    }
}
