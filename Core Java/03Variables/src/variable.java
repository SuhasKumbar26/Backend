public class variable {

    int classVariable;

    static float staticVariable = 123.23F;

    void dummyMethod(){
        long localVariable = 200;
        System.out.println(localVariable);
    }

    void dummyMethod1(int methodParameter){
        System.out.println(methodParameter);
    }


    public static void main(String[] args) {
//        dataType variableName = value
        char a = 'a';
        System.out.println(a);
//        static typed: what kind of value its stores
//        strongly typed: range of value its stores

//        case-sensitive
//        variable name starts with $, _, characters
//        camelCase naming convention
//        constant CONST = 10;

//        TYPE's
//        A. Primitive
//        int(4 byte), char(2 byte), float(4 byte), double(8 byte), boolean(1 bit), byte(1 byte), long(8 byte).

        int in = 23;
        char ch = 'a';
        long l = 123L;
        float f = .2F;
        boolean b = true;

//        lower to higher conversion (automatic/ widening/ implicit/ upcasting)
//        lower to higher conversion (manual/ narrowing/ explicit/ down casting)

//        promotion byte1(127) + byte2(1) = 128(int) 0r (byte) -128

        int var1 = 23;
        float var2 = var1;

        float var3 = 23.9F;
        int var4 = (int) var3;

        int localVariable = 234;
    }
}
