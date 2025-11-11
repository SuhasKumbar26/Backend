public class ConditionalStatements {
    public static void main(String[] args) {
        int val = 4;

        // if
        if( val == 4){
            System.out.println("Four..");
        }

        // if else
        if(val <= 3){
            System.out.println("Less than");
        } else {
            System.out.println("Greater than");
        }

        // if, else if, else
        if (val == 0){
            System.out.println("Zero");
        } else if (val >= 1){
            System.out.println("Positive");
        } else{
            System.out.println("Negative");
        }

        // nested if else
        if(val <= 10){
            System.out.println("Less than 10");
            if(val >= 3){
                System.out.println("Greater than 03");
            }
        }

//         Switch Statement
//        supported data type
//        -> int, char, short, byte and its Wrappers
//        -> Enum, String
//        -> no return Statement

        switch (val){
            case 1:
                System.out.println("1");
                break;
//            default: // Optional
//                System.out.println("None");
            case 2:
                System.out.println("2");
                break;
            default: // Optional
                System.out.println("None");
        }


        String str = switch (val){
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            default -> "Four"; // needed
        };
        System.out.println(str);
    }
}
