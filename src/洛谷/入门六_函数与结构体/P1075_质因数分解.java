package 洛谷.入门六_函数与结构体;

import java.util.Scanner;

public class P1075_质因数分解 {
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
