package edu.gcccd.csis;
import java.math.*;

public class Fibonacci{
    private static int timesRun;

    public static BigInteger fibonacci(BigInteger n, BigInteger t, int counter) {
        timesRun++;
        counter--;

        t = t.add(n);
        n = t.subtract(n);

        if (counter == 0) return t;
        return fibonacci(n, t, counter);

    }
    public static BigInteger fibonacci(int counter) {
        counter--;
        return fibonacci(BigInteger.ZERO, BigInteger.ONE, counter);
    }

    public static void main(String[] args) {
        long time, newTime;
        time = System.currentTimeMillis();
        System.out.println("The 2000-th Fibonacci Number is " + fibonacci(2000));
        newTime = System.currentTimeMillis();
        System.out.println("and was calculated in " + (newTime - time) + " ms" );
        System.out.println("The fibonacci() method was called " + timesRun + " times");
    }
}