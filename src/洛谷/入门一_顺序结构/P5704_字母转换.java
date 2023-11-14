package 洛谷.入门一_顺序结构;

import java.util.Scanner;

public class P5704_字母转换 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int b = a - 32;
        char c = (char)b;
        System.out.println(c);
    }
}