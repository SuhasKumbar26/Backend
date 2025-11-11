package AccessModifiers.Private;

public class privateMethod {
    // same class only
    private void methodIsPrivate(){
        System.out.println("I'm private");
    }

    public void testMethod(){
        methodIsPrivate(); // in the same class is Accessible
    }
}
