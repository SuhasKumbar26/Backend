package Checked;

public class tryCatch {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        try {
            throw new ClassNotFoundException();
        } catch (ClassNotFoundException exception){
            System.out.println(exception.toString());
        }
    }
}
