package TypesOfClasses.Abstract;

public abstract class Bird {
    // can have fully defined classes or abstract class
    // we can create an instance of his class
    String category;
    String breed;
    int breedId;

    public void makeVoice(){
        System.out.println("chew...chew...chew");
    }

    public String getCategory() {
        return category;
    }

    public abstract int getIdOfBird();

    public abstract void makeFly();
}
