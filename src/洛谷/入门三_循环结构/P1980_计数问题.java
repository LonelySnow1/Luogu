package 洛谷.入门三_循环结构;

import java.util.Scanner;

public class P1980_计数问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 0;
        char b = sc.next().charAt(0);
        int a = 0;
        for(int i = 1;i<=n;i++) {
            String e = String.valueOf(i);
            String c = e.replaceAll(b+"","");
            int a1 = e.length() - c.length();
            d += a1;
        }
        System.out.println(d);
    }
}