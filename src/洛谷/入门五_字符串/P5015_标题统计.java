package 洛谷.入门五_字符串;

import java.util.Scanner;

public class P5015_标题统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = 0;
        for(int i = 0;i<str.length();i++){
            if((int)str.charAt(i) != 32)
                a++;
        }
        System.out.println(a);
    }
}