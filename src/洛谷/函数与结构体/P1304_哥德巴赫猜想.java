package 洛谷.函数与结构体;

import java.util.Scanner;


public class P1304_哥德巴赫猜想 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        for(int i = 4;i<=b;i+=2){
            for(int k = 2;k<=i/2;k++){
                if(Ispri(k) && Ispri(i-k) ){
                        System.out.printf("%d=%d+%d\n",i,k,i-k);
                        break;
                }
            }
        }
    }
    public static boolean Ispri(int a){

            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0)
                    return false;
            }
        return true;
    }
}