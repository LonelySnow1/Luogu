package 洛谷.入门一_顺序结构;        /*
            代码以一种奇怪的方式运行起来了
            问题：由于浮点型数计算时会产产生精度损失，所以在计算时加上了 0.09 保证十分位上一定有数
            此题最好使用字符来进行完成
         */

/*
题目：
题目描述
输入一个不小于100 且小于1000，同时包括小数点后一位的一个浮点数，例如 123.4，要求把这个数字翻转过来，变4.321 并输出。

输入格式
一行一个浮点数

输出格式
一行一个浮点数
 */
import java.util.Scanner;
public class P5705_数字反转 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        int n = 0;//数字位数
        float c = 0;//余数
        float b = 0;//输出
        while(true){
            if(n<4){
//                System.out.println(Math.pow(10,n));
                c = (float) (a % Math.pow(10,n));
//                System.out.println("c="+c);
//                System.out.println("a="+a);
                a = a - c;
//                System.out.println("执行了"+(n+1)+"次");
//                123.4 ---> 4.321
                if(n == 0)
                    b += (int)((c+0.09) * 10);
                else
                    b += c * Math.pow(10,-(2*n-1));
                n++;
//                System.out.println(b);
            }
            else {
                System.out.println(String.format("%.3f", b));
                break;
            }
        }
    }
}
//方法二：
//import java.util.Scanner;
//        public class Main {
//            public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//                String a = sc.nextLine();
//                String b = "";
//                for(int i = a.length() - 1;i >= 0;i--){
//                    b += a.charAt(i);
//                }
//                float c = Float.parseFloat(b);
//                System.out.printf("%.3f",c);
//            }
//        }