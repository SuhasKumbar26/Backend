package classAndObjects;

public class Object {
    public static void main(String[] args) {
        Student st = new Student(123, 21, "java", "bangalore");

        st.rolNo = 345;

        System.out.println(st.rolNo);

        System.out.println(st.getAge());

        System.out.println(st.getCity());
    }
}
