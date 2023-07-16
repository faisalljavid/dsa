public class Overloading {
    public static void main(String[] args) {
        fun(67);
        //fun("Faisal");
        int ans = sum(2,3, 7); // 2nd sum function
        System.out.println(ans);
    }

    static void fun(int a) {
        System.out.println(a);
        System.out.println("first one");
    }

    static void fun(String name) {
        System.out.println(name);
        System.out.println("2nd one");
    }

    static int sum (int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
