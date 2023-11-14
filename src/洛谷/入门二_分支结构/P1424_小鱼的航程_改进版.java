package 洛谷.入门二_分支结构;

import java.util.Scanner;

public class P1424_小鱼的航程_改进版 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for (; b > 0; b--) {
            if (a == 8)
                a = 1;
            if (a <= 5)
                c += 250;

            a++;
        }
        System.out.println(c);
    }
}