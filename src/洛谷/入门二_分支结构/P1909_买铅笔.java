package 洛谷.入门二_分支结构;

import java.util.Scanner;

public class P1909_买铅笔 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b3 = sc.nextInt();
        int c3 = sc.nextInt();
        int d1 = (a % b1 == 0 ? a / b1 : a / b1 + 1) * c1;
        int d2 = (a % b2 == 0 ? a / b2 : a / b2 + 1) * c2;
        int d3 = (a % b3 == 0 ? a / b3 : a / b3 + 1) * c3;
        int d4 = Math.min(d1, d2);
        int d = Math.min(d4, d3);
        System.out.println(d);
    }
}