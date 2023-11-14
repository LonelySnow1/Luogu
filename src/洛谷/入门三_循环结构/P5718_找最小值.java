package 洛谷.入门三_循环结构;

import java.util.Scanner;

public class P5718_找最小值 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b = 1000;
        int n = sc.nextInt();
        for(int i = 0;i<n;i++) {
            a = sc.nextInt();
            b= b<a?b:a;
        }
        System.out.println(b);
    }
}