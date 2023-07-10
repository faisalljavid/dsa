import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter fruit: ");
//        String fruit = input.next();
//
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits.");
//            case "Apple" -> System.out.println("A sweet red fruit.");
//            case "Grapes" -> System.out.println("A small fruit.");
//            default -> System.out.println("Enter a valid fruit.");
//        }

        int empId = input.nextInt();
        String department = input.next();
        switch (empId) {
            case 1 -> System.out.println("Faisal Javid");
            case 2 -> System.out.println("Kunal Kushwaha");
            case 3 -> {
                System.out.println("Employee number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("no department entered");
                }
            }
        default -> System.out.println("Enter correct EmpID");
        }
    }

}
