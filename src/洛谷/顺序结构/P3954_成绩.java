package 洛谷.顺序结构;

import java.util.Scanner;
public class P3954_成绩 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = (int)(a*0.2+b*0.3+c*0.5);
        System.out.println(s);
    }
}