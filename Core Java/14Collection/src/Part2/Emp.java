package Part2;

public class Emp implements Comparable<Emp> {
    private String name;
    private String phone;
    private int id;

    public Emp(String name, String phone, int id){
        this.name = name;
        this.phone = phone;
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public String getPhone(){
        return this.phone;
    }

    public int getId(){
        return this.id;
    }

    @Override
    public int compareTo(Emp o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emp{");
        sb.append("name='").append(name).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
