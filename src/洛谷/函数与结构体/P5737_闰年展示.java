package 洛谷.函数与结构体;

import java.util.Scanner;

public class P5737_闰年展示 {
    /*
    闰年：
        1.被4整除而不能被100整除
        2.能被400整除
        以上两个条件，满足一个即可
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = 0;
        String str = "";
        for(;x<=y;x++){
            if(x%400 == 0 || (x%4 == 0 && x%100!= 0)){
                a++;
                str = str+x+" ";
            }
        }
        System.out.println(a);
        System.out.println(str.trim());
    }
}