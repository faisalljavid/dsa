import java.util.Scanner;
public class Loops  {
    public static void main(String[] args) {
        /*
            Syntax of FOR LOOP:

            for (initialisation; condition; increment/decrement) {
                // body
            }
         */

        // Q: Print numbers from 1 to 5
//        for (int num = 1; num <= 5; num+=1) {
//            System.out.println(num);
//        }

        // Q: Print numbers from 1 to n:
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = in.nextInt();
//
//        for (int num = 1; num <= n; num++) {
//            System.out.println(num + " ");
//        }


        // WHILE LOOPS (used when we don't know how many times the loop is going to run)

        /*
         Syntax:

         initialisation;
         while (condition) {
            body
            increment/decrement
         }
         */

//        int num = 1;
//        while (num <= 5) {
//            System.out.println(num);
//            num++; // num += 1 or 2 or 3;
//        }

        // DO WHILE LOOPS (when we want to execute the loop for at-least once)

        /*
            Syntax:

            initialisation;
            do {
                body
                increment/decrement
            } while (condition);
         */
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 6);
    }
}
