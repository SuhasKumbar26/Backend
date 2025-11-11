package Custom;

public class test {
    public static void main(String[] args) {
        try{
            method1();
        } catch (MyCustomException e){
            System.out.println(e.toString());
        }
    }

    private static void method1() throws MyCustomException{
        throw new MyCustomException("Issue Arises");
    }
}
