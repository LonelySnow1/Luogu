package 洛谷.函数与结构体;

import java.util.Scanner;

public class P5739_计算阶乘 {
//经典递归
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fac(sc.nextInt()));
    }
    public  static  int fac(int x){
        if(x != 1)
            return x*fac(x-1);
        else
            return 1;
    }
}