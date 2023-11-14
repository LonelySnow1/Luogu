package 洛谷.入门六_函数与结构体;

import java.util.Scanner;

public class P5735_距离函数 {
    //实数 = 有理数 + 无理数 + 0
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double c = distance(x1,y1,x2,y2) + distance(x1,y1,x3,y3) + distance(x2,y2,x3,y3);
        System.out.printf("%.2f",c);
    }
    public static double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }
}