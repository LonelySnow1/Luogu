package 洛谷.循环结构;

import java.math.BigInteger;
import java.util.Scanner;

public class P1009_阶乘之和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger a = new BigInteger("0");
        BigInteger c = BigInteger.valueOf(1);
        for(int i =1;i<=n;i++) {
            for(int b = i;b<=i;b++) {
                c = c.multiply(BigInteger.valueOf(b));
            }
            a = a.add(c);
        }
        if(n==0)
            System.out.println(0);
        else
            System.out.println(a);
    }
}
