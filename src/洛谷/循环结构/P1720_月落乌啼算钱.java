package 洛谷.循环结构;

import java.util.Scanner;

public class P1720_月落乌啼算钱 {
        public static void main(String[] args) {
            //此题由于n较小，直接暴力使用公式硬套，n大的话可以用斐波那契数列算，也可以手写高精度
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            double a = Math.sqrt(5);
            double b = (Math.pow((1+a),n)-Math.pow((1 - a),n))/(Math.pow(2,n)*a);
            System.out.printf("%.2f",b);
        }
}
