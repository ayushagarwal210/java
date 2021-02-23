import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class hello {

    // Complete the fibonacciModified function below.
    static BigInteger fibonacciModified(BigInteger t1, BigInteger t2, int n) {
        // long f[]=new long[n+2];
        // f[0]=t1;
        // f[1]=t2;
        BigInteger c= new BigInteger("0");
        // BigInteger a=new BigInteger("t1");
        // BigInteger b=new BigInteger("t2");
        for(int i=2;i<n;i++){
            c=t1.add(t2.multiply(t2));
            t1=t2;
            t2=c;
        }
    return c;
    }

    // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    BigInteger t1 = new BigInteger(in.nextInt()+"");
    BigInteger t2 = new BigInteger(in.nextInt()+"");
    int n = in.nextInt();
    System.out.println(fibonacciModified(t1, t2, n));
    in.close();
}
}
