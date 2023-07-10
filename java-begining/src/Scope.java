import java.util.Scanner;
//public class Scope {
//    public static void main(String[] args) {
//        // method scope
//        int a = 10;
//        int b = 20;
//    }
//
//    static void random() {
//        System.out.println(a); // error here, it doesn't recognize a
//    }
//}

// ----------------------------------------------------------------

//public class Scope {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        {
//            // block scope (values initialised in this block, will remain in block)
//           int a = 90; // error, can't initialize this again but can modify it.
//            a = 90; // no error
//            int c = 45;
//        }
//
//        System.out.println(c); // error, cannot use outside the block
//        System.out.println(a); // it will give 90 not 10
//    }
//}

// -------------------------------------------------------------------

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        //System.out.println(i); // error
    }
}