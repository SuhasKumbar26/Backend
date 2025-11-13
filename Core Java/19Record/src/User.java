public record User(String name, int age) {

    // String lastName; Instance field is not allowed in records

    // Static is allowed
    static String lastName;

    // overriding Canonical constructor
    public User(String name, int age){
        if (age < 0) throw new IllegalArgumentException("Non age");
        this.name = name;
        this.age = age;
    }

    // compact constructor
    /*
    public User{
        if (age < 0) throw new IllegalArgumentException("Non age");
    }
     */

    // different parameter constructor
    public User(int age){
        this("defaultName",age);
    }

    // nested STATIC record by default static
    record nestedStaticRecord(String city){
        public void display(){
            System.out.println("NESTED STATIC Record and city: "+city);
        }
    }

    // static class under record
    static class staticClass{
        public void staticClassDisplay(){
            System.out.println("STATIC class under record");
        }
    }

    // non-static class under record
    class nonStaticClass {
        public void nonStaticClassDisplay(){
            System.out.println("NON-STATIC class under record");
        }
    }

    public void printAddress(){
        record Address(String city, String state){

        }

        Address address = new Address("Pune","Maharashtra");
        System.out.println(address.city()+" "+address.state());
    }


}
