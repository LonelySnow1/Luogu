package 洛谷.入门二_分支结构;

import java.util.Scanner;

public class P5709_ApplesPrologue_苹果和虫子 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        int c = sc.nextInt();
        if (b == 0) {
            b = a;
            a = 0;
            if(c == 0)
                a = (int)b;
        } else {
            a -= Math.ceil(c / b);
            if (a < 0)
                a = 0;
        }
        System.out.println(a);
    }
}
