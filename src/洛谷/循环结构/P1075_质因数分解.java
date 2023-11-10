package 洛谷.循环结构;

import java.util.Scanner;

public class P1075_质因数分解 {
    //能分解成两个质数乘积的数不一定是质数，也不一定是奇数
    //2*5 = 10
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = 2;
            for(int i = 1;2*i+1<Math.sqrt(a);i++){
                if(a%b==0){
                    break;
                }
                b = 2*i+1;
            }
            System.out.println(Math.max(b, a / b));
        }
}
