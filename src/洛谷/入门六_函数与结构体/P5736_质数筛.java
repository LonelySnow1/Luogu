package 洛谷.入门六_函数与结构体;

import java.util.Scanner;

public class P5736_质数筛 {
    /*质数：
        1不是质数
        除了2外其他偶数都不是质数
        其他的都遵循平方试探（平方试探小于三，即一次都循环不了是质数 eg：3，5，7 开平方都小于3）
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder c = new StringBuilder();
        for(int i = 0 ;i < a ;i++){
            int b = sc.nextInt();
            if(pri(b))
              c.append(b).append(" ");
        }
        System.out.print(c);
    }
    public static boolean pri(int x){
        if(x == 1)
            return false;
        else{
            if(x % 2 != 0 || x == 2) {
                for (int i = 3; i <= Math.sqrt(x); i += 2) {
                    if (x % i == 0)
                        return false;
                }
                return true;
            }
        }
        return false;
    }
}