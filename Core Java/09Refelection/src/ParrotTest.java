import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;

public class ParrotTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        Class parrotClass = Parrot.class;
        Object parrotObj = parrotClass.newInstance();

        Method getDetailsMethod = parrotClass.getMethod("getDetails", String.class, BigInteger.class, String.class);
        getDetailsMethod.invoke(parrotObj,"Claw",BigInteger.valueOf(12335),"AWERex");


        Field[] fields = parrotClass.getDeclaredFields();
        for (Field field : fields){
            System.out.println("Field name: "+field.getName());
            System.out.println("Field Type: "+field.getType());
            System.out.println("Return Type: "+ Modifier.toString(field.getModifiers()));
        }


        // setting the value of PUBLIC NameField
        Parrot parrot = new Parrot();
        Field getBreedField = parrotClass.getDeclaredField("height");
        getBreedField.set(parrot,12);
        System.out.println("\n Height: "+parrot.height);

        // setting the value of PRIVATE NameField
        Parrot parrot1 = new Parrot();
        Field NameField = parrotClass.getDeclaredField("name");
        NameField.setAccessible(true); // important
        NameField.set(parrot1,"Barks");
        String name = (String) NameField.get(parrot1);
        System.out.println(name);
    }
}


































