package AnotherAnnotation.Repeatable;

public class Main {
    public static void main(String[] args) {
        Category[] categories = test.class.getAnnotationsByType(Category.class);
        for(Category category: categories){
            System.out.println(category.name());
        }
    }
}
