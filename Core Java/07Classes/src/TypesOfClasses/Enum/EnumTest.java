package TypesOfClasses.Enum;

public class EnumTest {
    public static void main(String[] args) {
        /*
        Common Methods
        Values() enum array[]
        Ordinal() default numbers of each Constant
        ValueOf() matches with existing Constant
        Name() name of constant
        * */

        for(EnumSample sample: EnumSample.values()){
            System.out.println(sample.ordinal());
        }

//        EnumSample enumSample = EnumSample.valueOf("Sun"); error
        EnumSample enumSample = EnumSample.valueOf("SUNDAY");
        System.out.println(enumSample.name());


        // Enum class
        for(EnumClass enumClass: EnumClass.values()){
            System.out.println("Ordinal: "+enumClass.ordinal()+" Values: "+enumClass.getVal()+" Comments: "+enumClass.getComment());
        }

        EnumClass enumClass = EnumClass.matchValue(102);
        System.out.println(enumClass);

        EnumClass enumClass1 = EnumClass.SATURDAY;
        enumClass1.method();

        EnumClass enumClass2 = EnumClass.MONDAY;
        enumClass2.method();


        EnumSample enumSample1 = EnumSample.MONDAY;
        System.out.println(enumSample1.makeLowerCase());
    }
}
