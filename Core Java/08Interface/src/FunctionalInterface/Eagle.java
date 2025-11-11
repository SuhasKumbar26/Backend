package FunctionalInterface;

public class Eagle implements Bird{
    String name;

    Eagle(String name){
        this.name = name;
    }

    @Override
    public void getBirdName() {
        System.out.println("Bird name is: "+ name);
    }
}
