package TypesOfClasses.NestedClasses.LocalInnerClass;

public class OuterClass {
    int instVar=12;
    static int classVar=23;

    public void display(){
        int metVar = 20;

        class LocalInnerClass{
            int localVar = 10;
            public void print(){
                System.out.println(instVar + classVar + metVar + this.localVar);//65
            }
        }

        LocalInnerClass localInnerClassObj = new LocalInnerClass();
        localInnerClassObj.print();

    }
}
