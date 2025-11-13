public class Main {
    static void main() {
        User user1 = new User("JAVA", 83);
        System.out.println(user1.age()+" "+user1.name());

        User user2 = new User(12);
        System.out.println(user2.age()+" "+user2.name());

        // nested STATIC record by default static
        User.nestedStaticRecord staticRec = new User.nestedStaticRecord("Pune");
        System.out.println(staticRec.city());

        // static class under record
        User.staticClass staticClass = new User.staticClass();
        staticClass.staticClassDisplay();

        // non-static class under record
        User user3 = new User("CheckName",46);

        User.nonStaticClass nonStaticClass = user3.new nonStaticClass();
        nonStaticClass.nonStaticClassDisplay();

        user3.printAddress();

    }
}
