package TypesOfClasses.Enum;

public enum EnumSample implements myInterface {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    @Override
    public String makeLowerCase() {
        return this.name().toLowerCase();
    }
}
