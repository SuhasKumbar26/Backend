public class BranchingStatement {
    public static void main(String[] args) {

        // Continue
        for (int i = 0; i < 10; i++) {
            if(i == 3){
                continue;
            }
            System.out.print(i+" "); // 0 1 2 4 5 6 7 8 9
        }
        System.out.println();

        // Break
        for (int i = 0; i < 10; i++) {
            if(i == 3){
                break;
            }
            System.out.print(i+" "); // 0 1 2
        }
    }
}
