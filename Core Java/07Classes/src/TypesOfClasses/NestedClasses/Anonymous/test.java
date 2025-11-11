package TypesOfClasses.NestedClasses.Anonymous;

public class test {
    public static void main(String[] args) {
        Car carObj = new Car() {
            @Override
            public void pressBreak() {
                System.out.println("break is Pressed Dude...");
            }
        };

        carObj.pressBreak();
    }
}
