package 洛谷.顺序结构;

import java.util.Scanner;

public class B2005_字符三角形 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        System.out.println("  "+a);
        System.out.println(" "+a+a+a);
        System.out.println(""+a+a+a+a+a);
    }
}