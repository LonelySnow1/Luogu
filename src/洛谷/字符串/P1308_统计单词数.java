package 洛谷.字符串;

import java.util.Scanner;

public class P1308_统计单词数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toUpperCase();
        String str2 = sc.nextLine().toUpperCase();
        boolean t = true;
        int a = str2.indexOf(str1);
        int b = -1;//不能直接输出b，b没有判断是否为独立单词
        int cont = 0;
        while(a != -1){
            if((a==0 || str2.charAt(a-1)==' ') && (a+str1.length() == str2.length() || str2.charAt(a+str1.length()) == ' ')) {
                cont++;
                if(t){//第一次成功检测的位置记录在 b
                    b = a;
                    t = false;
                }
            }
            a = str2.indexOf(str1,a+str1.length());
        }
        if(cont == 0)
            System.out.println(-1);
        else
            System.out.printf("%d %d",cont,b);
    }
}