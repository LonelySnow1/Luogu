package 洛谷.入门五_字符串;

import java.util.Scanner;

public class P1914_小书童_凯撒密码 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        for(int i = 0;i<str.length();i++){
            int a = (int)str.charAt(i)+n;
            while(a>'z')
                a = a-'z'-1+'a';
            System.out.print((char)a);
        }
    }
}