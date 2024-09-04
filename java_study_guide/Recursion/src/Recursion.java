public class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fib(8));


    }

    public static int fact(int n) {
        if(n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
    public static int fib(int n) {
        
        if (n <=1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);


    }
}
