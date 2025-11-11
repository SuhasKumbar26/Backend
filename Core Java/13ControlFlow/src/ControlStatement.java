public class ControlStatement {
    public static void main(String[] args) {
        // for
        for (int i = 0; i < 3; i++) {
            System.out.println("For");
        }

        int j = 0;
        while( j < 5){
            System.out.println("While");
            j++;
        }

        int k = 0;
        do{
            System.out.println("DO");
            k++;
        }while (k<2);
    }
}
