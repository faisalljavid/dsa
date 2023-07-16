import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 99);
        multiple(2,3,"Faisal");
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {
        System.out.println(Arrays.toString(v));
    }
}
