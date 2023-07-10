import java.util.Scanner;
//public class Methods {
//    public static void main(String[] args) {
////        sum();
////
////    }
////
////    /*
////        return_type name ()
////            body
////            return statement;
////        }
////     */
////
////    static void sum() {
////        Scanner input = new Scanner(System.in);
////        System.out.print("Enter number 1: ");
////        int num1 = input.nextInt();
////        System.out.print("Enter number 2: ");
////        int num2 = input.nextInt();
////        int sum = num1 + num2;
////        System.out.println("Sum is: " + sum);
//
//        String message = greet();
//        System.out.println(message);
//    }
//    static String greet() {
//        return "how are you";
//    }
//}

// ----------------------------------------------------------------------
public class Methods {
    public static void main(String[] args) {
//        int ans = sum3(30, 40);
//        System.out.println(ans);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = input.nextLine();
        String personalized = myGreet(naam);
        System.out.println(personalized);
        System.out.println(greet());
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

//    static int sum3(int a, int b) {
//        int sum = a + b;
//        return sum;
//    }
    static String greet() {
        String greeting = "How are you?";
        return greeting;
    }
}
