package AnotherAnnotation;

import java.lang.annotation.*;

//@Documented // -> Available during java documentation generation time
//@Inherited // -> child class also can have This MyCustom Annotation
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustomAnnotation {
}
