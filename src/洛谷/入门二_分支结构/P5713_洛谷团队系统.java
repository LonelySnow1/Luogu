package 洛谷.入门二_分支结构;

import java.util.Scanner;

public class P5713_洛谷团队系统 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a*5;
        int c = 11 + a*3;
        String d;
        d = b<c?"Local":"Luogu";
        System.out.println(d);
    }
}
