package TypesOfClasses.Enum;

public enum EnumClass {
    MONDAY(101,"1 day"){
        @Override
        public void method() {
            System.out.println("Monday dummy method");
        }
    },
    TUESDAY(102,"2 day"){
        @Override
        public void method(){
            System.out.println("Tuesday dummy method");
        }
    },
    WEDNESDAY(103,"3 day"),
    THURSDAY(104,"4 day"),
    FRIDAY(105,"5 day"),
    SATURDAY(106,"6 day"),
    SUNDAY(107,"7 day");

    private int val;
    private String comment;

    EnumClass(int val, String comment){
        this.val =  val;
        this.comment = comment;
    }

    public int getVal(){
        return this.val;
    }

    public String getComment() {
        return comment;
    }

    public static EnumClass matchValue(int value){
        for (EnumClass enumClass: EnumClass.values()){
            if(enumClass.val == value){
                return enumClass;
            }
        }
        return null;
    }

    public void method(){
        System.out.println("Default dummy method");
    }

}
