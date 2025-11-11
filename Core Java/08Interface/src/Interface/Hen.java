package Interface;

public class Hen implements Bird{
    @Override
    public void fly(){
        System.out.println("Interface.Hen is Flying...");
    }

    @Override
    public String getAge() {
        return "";
    }

    @Override
    public void name() {
        Bird.super.name();
    }
}
