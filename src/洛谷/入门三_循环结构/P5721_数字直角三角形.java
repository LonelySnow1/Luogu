package 洛谷.入门三_循环结构;

import java.util.Scanner;

public class P5721_数字直角三角形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 1;
        for(int i = n;i>=1;i--) {
            for(int a = 1;a<=i;a++) {
                System.out.printf("%02d",b);
                b++;
            }
            System.out.println();
        }
    }
}