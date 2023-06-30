import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = (int) (45.432f); //Type Casting
        System.out.println(num); // Prints only integer part i.e, 45
    }
}
