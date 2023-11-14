package 洛谷.入门六_函数与结构体;

import java.util.Scanner;

public class P5743_猴子吃桃 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Monkey(n,1));
    }
    public static  int Monkey(int a,int b){
        b = (b+1)*2;
        if(a==1)
            return 1;
        if(a==2)
            return b;
        return Monkey(--a,b);
    }
}