package Basic;

public class Person {
//  constructor can be overloaded
    int Id;
    String name;

    // TYPES

    // no args Constructor
    Person(){

    }

    // parameterized constructor
    Person(int val){
        Id = val;
    }

    Person(int val, String name){
        Id = val;
        this.name = name;
    }


}
