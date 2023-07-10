import java.util.Arrays;
import java.util.Scanner;
//public class Methods2 {
//    public static void main(String[] args) {
//        String name = "Faisal";
//        changeName(name);
//        System.out.println(name);
//    }
//
//    static void changeName(String naam) {
//        naam = "Kunal"; // creating a new object
//    }
//}

// Output will be Faisal. Original will not be changed.

// ---------------------------------------------------------------

public class Methods2 {
    public static void main(String[] args) {
        // create an array
        int [] arr = {1, 3, 4, 6, 45};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99; // if you make change to the object via this reference variable, same object will be changed.
    }
}

// here the original array will be modified.

//--------------------------------------------------------------------------




