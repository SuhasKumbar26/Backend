package Interface;

public class Eagle implements Bird{

    @Override
    public void fly(){
        System.out.println("Interface.Eagle is Flying...");
    }

    @Override
    public String getAge() {
        return "Class";
    }

    @Override
    public void name() {
        Bird.super.name();
    }

    final public void run(){
        System.out.println("Implementation goes here");
    }


}
