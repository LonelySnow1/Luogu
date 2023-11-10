package 洛谷.顺序结构;

import java.util.Scanner;
public class P1425_小鱼的游泳时间 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int t1 = a*60+b;
        int t2 = c*60+d;
        int t = t2 - t1;
        int h = t/60;
        int m = t%60;
        System.out.printf("%d %d",h,m);
    }
}