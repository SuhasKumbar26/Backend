package classAndObjects;

public class Student {
    /* properties */
    int rolNo;
    private int age;
    private String name;
    private String city;

    public Student(int rolNo, int age, String name, String city){
        this.rolNo = rolNo;
        this.age = age;
        this.name = name;
        this.city = city;
    }

    public void updateCity(String city){
        this.city = city;
    }

    public int getAge(){
        return this.age;
    }

    public String getCity(){
        return this.city;
    }
}
