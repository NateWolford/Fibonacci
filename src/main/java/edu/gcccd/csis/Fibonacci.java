package edu.gcccd.csis;
import java.math.*;

public class Fibonacci{
    private static int counter = 0;

    public static final BigInteger[] fibMemory = new BigInteger[2001];

    static {
        fibMemory[0] = BigInteger.ONE;
        fibMemory[1] = BigInteger.ONE;
    }

    public static BigInteger fibonacci(int n) {
        counter++;
        if(fibMemory[n] == null)
        if(n == 0) {
            fibMemory[n] = BigInteger.valueOf(0);
        } else if(n == 1 || n ==2) {
            fibMemory[n]= BigInteger.valueOf(1);
        } else {
            fibMemory[n] = fibonacci(n-1).add(fibonacci(n-2));
        }
        return fibMemory[n];
    }

    public static void main(String[] args) {
        long time, newTime;
        time = System.currentTimeMillis();
        System.out.println("The 2000-th Fibonacci Number is " + fibonacci(2000) );
        newTime = System.currentTimeMillis();
        System.out.println("and was calculated in " + (newTime - time) + " ms" );
        System.out.println("The fibonacci() method was called " + counter + " times");
    }
}