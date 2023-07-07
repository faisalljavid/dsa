import  java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter number: ");  ODD-EVEN PROGRAM
//        int num = input.nextInt();
//
//        if (num % 2 == 0) {
//            System.out.println(num + " is even");
//        }
//        else {
//            System.out.println(num + " is odd");
//        }

// --------------------------------------------------------------

//        System.out.print("Enter Principle Amount: ");  SIMPLE INTEREST PROGRAM
//        int pr = input.nextInt();
//        System.out.print("Enter Rate of Interest: ");
//        float roi = input.nextFloat();
//        System.out.print("Enter Time(years): ");
//        int time = input.nextInt();
//
//        float si = (pr * roi * time) / 100;
//
// ----------------------------------------------------------------

//        System.out.print("Enter first num: ");      BASIC CALCULATOR PROGRAM
//        int num1 = input.nextInt();
//        System.out.println("Enter operator(+ - / *): ");
//        char opr = input.next().charAt(0);
//        System.out.print("Enter 2nd num: ");
//        int num2 = input.nextInt();
//
//        if (opr == '+' ) {
//            System.out.println(num1 + num2);
//        }
//        else if (opr == '-') {
//            System.out.println(num1 - num2);
//        }
//        else if (opr == '/') {
//            System.out.println(num1 / num2);
//        }
//        else if (opr == '*') {
//            System.out.println(num1 * num2);
//        }

// -----------------------------------------------------------------
        // FIBONACCI SERIES

//        System.out.print("Enter n: ");
//        int fib = input.nextInt();
//
//        int firstTerm = 0, secondTerm = 1;
//
//        for (int i = 1; i <= fib; i++) {
//            System.out.print(firstTerm + " ");
//            int nextTerm = firstTerm + secondTerm;
//            firstTerm = secondTerm;
//            secondTerm = nextTerm;
//        }

// ----------------------------------------------------------------
        //PALINDROME

//        String str, rev = "";
//        System.out.print("Enter your string: ");
//        str = input.nextLine();
//        str = str.toLowerCase();
//
//        int length = str.length();
//
//        for (int i = (length - 1); i >= 0; i-- ) {
//            rev = rev + str.charAt(i);
//        }
//        if (str.equals(rev)) {
//            System.out.println("String is Palindrome.");
//        }
//        else {
//            System.out.println("String is not Palindrome.");
//        }
// ----------------------------------------------------------------
        // ARMSTRONG NUMBERS

//        System.out.print("Enter number: ");
//        int num = input.nextInt();
//        int originalNumber = num;
//        int numDigits = String.valueOf(num).length();
//        int sum = 0;
//
//        while (num > 0) {
//            int digit = num % 10;
//            sum += Math.pow(digit, numDigits);
//            num = num / 10;
//        }
//
//        if (sum == originalNumber) {
//            System.out.println(originalNumber + " is an Armstrong number");
//        }
//        else {
//            System.out.println(originalNumber + " is not an Armstrong number");
//        }
// ---------------------------------------------------------------------

        // LARGEST NUMBER (of 3)

//        System.out.print("Enter three numbers: ");
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();

//        int max = a;
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
        // another method
//        int max = Math.max(c,Math.max(a,b));
//        System.out.println("max number is: " + max);
// -------------------------------------------------------------------

        // CASE CHECK

//        char ch = input.next().trim().charAt(0); // trim removes spaces
//
//        if (ch >= 'a' && ch <= 'z') {
//            System.out.println("Lowercase");
//        } else {
//            System.out.println("Uppercase");
//        }
// -------------------------------------------------------------------------

        // FIBONACCI NUMBERS (AGAIN) (0, 1, sum of previous two numbers)
//
//        System.out.print("Enter number: ");
//        int n = input.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//
//        while (count <= n) {
//            int temp = b;
//            b = b + a;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);
// ----------------------------------------------------------------------------
//
        // COUNTING OCCURRENCES

//        int n = 45536;
//        int count = 0;
//
//        while (n > 0) {
//            int rem = n % 10;
//            if (rem == 5) {
//                count++;
//            }
//            n = n / 10;
//        }
//        System.out.println(count);

// ---------------------------------------------------------------------
//
        // REVERSE

//        int num = 245263;
//        int ans = 0;
//
//        while (num > 0) {
//            int rem = num % 10;
//            num /= 10;
//
//            ans = ans * 10 + rem;
//        }
//        System.out.println(ans);
//
// -----------------------------------------------------------------
//
        // CALCULATOR PROGRAM

        // Take input from user till user does not press X or x

        int ans = 0;
        while (true) {
            System.out.print("Enter the operator: ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation!");
            }
            System.out.println(ans);
        }
    }
}
