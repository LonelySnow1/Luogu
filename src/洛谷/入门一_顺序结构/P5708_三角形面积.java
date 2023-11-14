package 洛谷.入门一_顺序结构;/*
四舍五入方法 Math.round();
需要四舍五入到某一位小数时，可以先乘10^n，使这个数变成对应的位数
在进行四舍五入，就可以了
 */

import java.util.Scanner;
public class P5708_三角形面积 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextFloat();
        double b = sc.nextFloat();
        double c = sc.nextFloat();
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        s = Math.round(s*10);
        s = s/10;
        System.out.printf("%.1f",s);
    }
}