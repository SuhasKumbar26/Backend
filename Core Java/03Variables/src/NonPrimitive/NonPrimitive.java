package NonPrimitive;

public class NonPrimitive {
    public static void main(String[] args) {
//        Reference data type
//        1.Class 2.String 3.Interface 4.Arrays
//        everything is pass by value

        // CLASS
        Engineer engineer = new Engineer();
        // engineer is referencing Engineer obj

        // STRING
        String str = "java"; // string literal -> goes into string pool(inside heap).
        String str1 = "java";

        System.out.println(str == str1); // true

        String obj = new String("java"); // objects are stored in string pool

        System.out.println(obj == str); // false


        // INTERFACE
        Person eng = new Engineer();
        System.out.println(eng.profession());

        Person teach = new Teacher();
        System.out.println(teach.profession());

        // ARRAY
//        a sequence of memory stores the same data type
        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int[] arr1 = {10, 20, 30};

        // two d arrays
        int[][] twoArr = new int[2][3];
        // 2 rows and 3 columns
        twoArr[0][2] = 123;

        int[][] twoArr1 = {{10,20,30},{40,50,60}};


    }
}
