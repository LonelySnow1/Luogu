package 洛谷.入门二_分支结构;

import java.util.Scanner;

public class P1888_三角函数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = Math.min(a, Math.min(b, c));
        int e = Math.max(a, Math.max(b, c));
        int f = abc(d,e);
        if(f==0)
            f=1;
        System.out.printf("%d/%d",d/f,e/f);
    }

    public static int abc(int a, int b) {
        int c = Math.max(a, b);
        b = a + b - c;
        a = c;
        if (a % b != 0)
            return abc(a % b, b);
        else
            return b;

    }
}