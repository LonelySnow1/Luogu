package 洛谷.入门二_分支结构;

import java.util.Scanner;

public class P1422_小玉家的电费 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = 0;
        if (a > 150)
            if (a > 400)
                b = 150 * 0.4463 + 250 * 0.4663 + (a - 400) * 0.5663;
            else
                b = 150 * 0.4463 + (a - 150) * 0.4663;
        else
            b = a * 0.4463;
        b *= 10;
        b = Math.round(b);
        System.out.println(b / 10);
    }
}