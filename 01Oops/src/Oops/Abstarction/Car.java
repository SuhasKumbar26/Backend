package Oops.Abstarction;

public interface Car {

    default void reduceSpeed(){
        System.out.println("now car is going to slow...");
    }

}
