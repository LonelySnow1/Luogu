package 洛谷.顺序结构;

import java.util.Scanner;
public class P1421_小玉买文具 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c,d,n;
        c = a*10+b;
        d = 19;
        n = (int)Math.floor(c/d);
        System.out.println(n);
    }
}