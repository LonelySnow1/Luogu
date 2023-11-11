package 洛谷.算法1_1_模拟与高精度;

import java.math.BigInteger;
import java.util.Scanner;

public class P1591_阶乘数码 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger facn = BigInteger.valueOf(0);
        for(int i = 0;i<n;i++) {
            int num = sc.nextInt();
            String target = sc.next();
            facn = fac(num);
            String facs = facn+"";
            String b = facs.replaceAll(target, "");
            System.out.println(facs.length()-b.length());
        }
    }
    public static BigInteger fac(int num) {
        if(num != 1)
            return BigInteger.valueOf(num).multiply(fac(num-1));
        else
            return BigInteger.valueOf(1);
    }
}