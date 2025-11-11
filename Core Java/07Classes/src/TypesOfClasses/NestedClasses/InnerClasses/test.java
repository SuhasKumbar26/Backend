package TypesOfClasses.NestedClasses.InnerClasses;

public class test {
    public static void main(String[] args) {
        OuterClass outerClassObj = new OuterClass();
        OuterClass.innerClass innerClassObj = outerClassObj.new innerClass();

        innerClassObj.print();
    }
}
