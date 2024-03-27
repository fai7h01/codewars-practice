package kata_5kyu;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fibonacci(50));

    }

    private static long fibonacci(int n) {
        return fibonacci(n, new long[n + 1]);
    }

    private static long fibonacci(int n, long[] fibonacciCache) {

        if (n == 0 || n == 1) return n;

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = fibonacci(n - 1, fibonacciCache) + fibonacci(n - 2, fibonacciCache);
        fibonacciCache[n] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }

}
