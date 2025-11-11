package Chaining;

public class Bird {
    // Constructor chaining
    String category;
    String breed;
    int regNo;

    Bird(String category,String breed, int regNo){
        this(category, breed); // chaining
        this.regNo = regNo;
    }


    public Bird(String category, String breed) {
        this.category = category;
        this.breed = breed;
    }
}
