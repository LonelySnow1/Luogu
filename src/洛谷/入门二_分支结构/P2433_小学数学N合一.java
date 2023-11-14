package 洛谷.入门二_分支结构;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class P2433_小学数学N合一 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b, c, d;
        double e, f;
        double pi = 3.141593;
        switch (n) {
            case 1:
                System.out.println("I love Luogu!");
                break;
            case 2:
                a = 2 + 4;
                b = 10 - a;
                System.out.printf("%d %d", a, b);
                break;
            case 3:
                a = 14 / 4;
                b = a * 4;
                c = 14 - b;
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                break;
            case 4:
                e = 500;
                f = 3;
                BigDecimal g = new BigDecimal(String.valueOf(e / f));
                MathContext mc = new MathContext(6);// 有效数字位数位6
                System.out.println(g.divide(BigDecimal.ONE, mc));// 让e/f的结果除1，并且保留6位小数
                break;
            case 5:
                a = 260 + 220;
                b = 12 + 20;
                c = a / b;
                System.out.println(c);
                break;
            case 6:
                e = Math.sqrt(6 * 6 + 9 * 9);
                System.out.printf("%.4f", e);
                break;
            case 7:
                a = 100 + 10;
                b = a - 20;
                c = 0;
                System.out.printf("%d\n%d\n%d", a, b, c);
                break;
            case 8:
                int r = 5;
                e = 2 * r * pi;
                f = pi * r * r;
                double v = (4 / 3.0) * pi * r * r * r;
                System.out.printf("%.4f\n%.4f\n%.3f", e, f, v);
                break;
            case 9:
                a = (((2 * 2) + 1) * 2 + 1) * 2;
                System.out.println(a);
                break;
            case 10:
                System.out.println(9);
                break;
            case 11:
                e = 100 / 3.0;
                System.out.printf("%.4f", e);
                break;
            case 12:
                a = 'A';
                b = 'M' - 'A' + 1;
                char q = (char) (a + 18 - 1);
                System.out.println(b);
                System.out.println(q);
                break;
            case 13:
                e = (4 / 3.0 * 4 * 4 * 4 * pi) + (4 / 3.0 * 10 * 10 * 10 * pi);
                f = Math.cbrt(e);
                System.out.println((int) (Math.floor(f)));
                break;
            case 14:
                a = 110;
                b = 10;
                c = d = 0;
                a--;
                for (; a > 0; a--) {
                    b++;
                    if (a * b > 3500)
                        c = a;
                    if (a * b < 3500 && a < c) {
                        d = a;
                        if ((d - 1) * (b + 1) < 3500)
                            break;
                    }
                }
                int b1 = 120 - c;
                int b2 = 120 - d;
                int b3 = (b1 + b2) / 2;
                int w;
                if (b3 * (c + d) / 2 > 3500)
                    w = d;
                else if (b3 * (c + d) / 2 < 3500)
                    w = c;
                else
                    w = (c + d) / 2;
                System.out.println(w);
                break;
        }
    }
}