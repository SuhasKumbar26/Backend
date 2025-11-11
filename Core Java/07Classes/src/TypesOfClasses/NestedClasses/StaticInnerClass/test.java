package TypesOfClasses.NestedClasses.StaticInnerClass;

public class test {
    public static void main(String[] args) {
        OuterClass.nestedInnerClass obj = new OuterClass.nestedInnerClass();
        obj.print();

        // nested private

        OuterClass outerClass = new OuterClass();
        outerClass.show();
    }
}
