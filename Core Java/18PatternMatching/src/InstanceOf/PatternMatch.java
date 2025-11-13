package InstanceOf;

public class PatternMatch {
    static void main() {
        Object obj = "Hello Java";

        // This is before java 16
        if (obj instanceof String){
            String s = (String) obj;
            System.out.println(s.toUpperCase());
        }

        // After java 16+
        if (obj instanceof String s){
            System.out.println(s.toLowerCase());
        }

        TwoWheeler twoW = new TwoWheeler();
        FourWheeler fourW = new FourWheeler();

        if (twoW instanceof Vehicle v){
            v.Drive();
        }
    }
}
