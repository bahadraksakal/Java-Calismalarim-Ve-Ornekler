package fibonacci_serisi_ornek;

public class Fibonacci_Serisi_Ornek {

    static int fib_recursive(int x, int y, int z) {
        if (x > 200) {
            return x;
        }
        System.out.println(x);
        z = x + y;
        y = x;
        x = z;
        return Fibonacci_Serisi_Ornek.fib_recursive(x, y, z);
    }

    static int fib_rec(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 1;
        }
        return Fibonacci_Serisi_Ornek.fib_rec(n - 1) + Fibonacci_Serisi_Ornek.fib_rec(n - 2);
    }

    public static void main(String[] args) {
        int i;
        int a = 1;
        int b = 1;
        System.out.println(a + "\n" + b);
        for (i = 0; i < 10; ++i) {
            int c = a + b;
            b = a;
            a = c;
            System.out.println(c);
        }
        System.out.println("\n*********\n");
        Fibonacci_Serisi_Ornek.fibonacci_dizilerle();
        System.out.println("\n*********\n");
        Fibonacci_Serisi_Ornek.fib_recursive(1, 1, 0);
        System.out.println("\n*********\n");
        for (i = 0; i < 10; ++i) {
            System.out.println(Fibonacci_Serisi_Ornek.fib_rec(i));
        }
    }

    static void fibonacci_dizilerle() {
        int[] fib = new int[12];
        fib[0] = 1;
        fib[1] = 1;
        System.out.println(fib[0] + "\n" + fib[1]);
        for (int i = 0; i < 10; ++i) {
            fib[i + 2] = fib[i] + fib[i + 1];
            System.out.println(fib[i + 2]);
        }
    }
    
}
