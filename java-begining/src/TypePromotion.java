import java.util.Scanner;
public class TypePromotion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int a = 257;
//        byte b = (byte) (a); // 257 % 256 = 1
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//        System.out.println(d); //output = 20

//        byte b = 50;
//        b = b * 2; // to make this work convert RHS to byte: b = (byte) (b * 2);
//        System.out.println(b);

        byte b = 4;
        char c = 'a';
        short s = 102;
        int i = 500;
        float f = 5.6f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + " " + (i / c) + " " + - (d * s));
        System.out.println(result);
    }
}
