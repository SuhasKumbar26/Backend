import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class testEagle {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Class birdObj = Bird.class;

//        Method[] methods = birdObj.getMethods();
//
//        for( Method method: methods){
//            System.out.println("method name: "+method.getName());
//            System.out.println("Class name: "+method.getDeclaringClass());
//            System.out.println("Return Type: "+method.getReturnType());
//            System.out.println("################");
//        }

        Method[] methods1 = birdObj.getDeclaredMethods();
        // only class private and public methods will be return

        for( Method method: methods1){
            System.out.println("method name: "+method.getName());
            System.out.println("Class name: "+method.getDeclaringClass());
            System.out.println("Return Type: "+method.getReturnType());
            System.out.println("Modifier Type: "+Modifier.toString(method.getModifiers()));
            System.out.println("################");
        }

        Class eagleClass = Eagle.class;

        Constructor[] constructorsList = eagleClass.getDeclaredConstructors();

        for (Constructor constructor: constructorsList){
            System.out.println("Modifier: "+ Modifier.toString(constructor.getModifiers()));

            constructor.setAccessible(true);
            Eagle eagleObj = (Eagle) constructor.newInstance();

            eagleObj.canFly();
        }
    }
}
