import java.math.BigInteger;

public class Parrot {
    public String breed;
    private String name;
    public BigInteger age;
    public int height;

    Parrot(){

    }

    public void getDetails(String name, BigInteger age, String breed){
        System.out.println("Name: "+name+" "+"Age: "+age+" "+"Breed: "+breed);
    }
}
