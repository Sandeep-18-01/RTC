package rtc.common.enums;

public interface EnumAsInterface {
    public static final String Attendence="Attendence";
    public static final String employees="employees";
    public static final String department="department";
    public static final String shifts="shifts";
    public static final String payroll="payroll";
    public default String interfaceShouldContainMethod(String description){
        return description;
    }
}
