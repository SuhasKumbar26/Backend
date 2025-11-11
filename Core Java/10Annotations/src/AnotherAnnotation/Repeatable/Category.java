package AnotherAnnotation.Repeatable;

import java.lang.annotation.*;

@Repeatable(Categories.class)
public @interface Category {
    String name();
}
