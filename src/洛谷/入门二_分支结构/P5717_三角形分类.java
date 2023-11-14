package 洛谷.入门二_分支结构;

import java.util.Scanner;

public class P5717_三角形分类 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a1 = Math.max(a, Math.max(c, b));
        int b1 = Math.min(a, Math.min(b, c));
        int c1 = a + b + c - a1 - b1;
        if (a1 >= b1 + c1)
            System.out.println("Not triangle");
        else {
            if (a1 * a1 == b1 * b1 + c1 * c1)
                System.out.println("Right triangle");
            if (a1 * a1 < b1 * b1 + c1 * c1)
                System.out.println("Acute triangle");
            if (a1 * a1 > b1 * b1 + c1 * c1)
                System.out.println("Obtuse triangle");
            if (b1 == c1 || a1 == c1)
                System.out.println("Isosceles triangle");
            if (a1 == b1)
                System.out.println("Equilateral triangle");
        }
    }
}