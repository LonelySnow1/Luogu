package 洛谷.算法1_1_模拟与高精度;

import java.math.BigInteger;
import java.util.Scanner;

public class P1303_两个乘积_Problem {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.multiply(b));
    }
}