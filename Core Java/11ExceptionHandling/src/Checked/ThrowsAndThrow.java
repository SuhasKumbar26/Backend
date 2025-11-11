package Checked;

public class ThrowsAndThrow {
    public static void main(String[] args) throws ClassNotFoundException{
        method1();
    }

    private static void method1() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }


}
