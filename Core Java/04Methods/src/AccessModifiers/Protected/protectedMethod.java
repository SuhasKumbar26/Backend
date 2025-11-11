package AccessModifiers.Protected;

public class protectedMethod {
    // same package and subclass in different package
    protected void methodIsProtected(){
        System.out.println("I'm protected");
    }

    public void methodTest(){
        methodIsProtected(); // same class accessible
    }
}
