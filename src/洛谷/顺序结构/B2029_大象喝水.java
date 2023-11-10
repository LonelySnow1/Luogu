package 洛谷.顺序结构;

import java.util.Scanner;
public class B2029_大象喝水 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        int h = sc.nextInt();
        int r = sc.nextInt();
        double s = PI*r*r;
        double v = s * h;
        int n = (int) Math.ceil((20*1000)/v);
        System.out.println(n);
    }
}