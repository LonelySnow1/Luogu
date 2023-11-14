package 洛谷.入门三_循环结构;

import java.util.Scanner;

public class P5719_分类平均 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double a = 0 ,b = 0;
        int n1 = 0, n2 = 0;
        for(int i = 1;i<=n;i++) {
            if(i%k == 0) {
                a += i;
                n1++;
            }
            else {
                b += i;
                n2++;
            }
        }
        System.out.printf("%.1f %.1f",a/n1,b/n2);
    }
}