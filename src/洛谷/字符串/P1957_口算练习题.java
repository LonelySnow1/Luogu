package 洛谷.字符串;

import java.util.Scanner;

public class P1957_口算练习题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c;
        char o = 'a';
        int ans = 0;
        String equ = "";
        for(int i = 0;i<a;i++) {
            int b = 0;
            String str = sc.next();
            if((int)str.charAt(0)-'a'>= 0) {
                o = str.charAt(0);
                b = sc.nextInt();
            }
            else{
                for(int m = 0;m<str.length();m++){
                    b = (int) (b+((int)str.charAt(m)-'0')*Math.pow(10,str.length()-1-m));
                }
            }
            c = sc.nextInt();
            switch(o){
                case 'a':
                    ans = b+c;
                    equ = b+"+"+c+"="+ans;
                    System.out.println(equ);
                    System.out.println(equ.length());
                    break;
                case 'b':
                    ans = b-c;
                    equ = b+"-"+c+"="+ans;
                    System.out.println(equ);
                    System.out.println(equ.length());
                    break;
                case 'c':
                    ans = b*c;
                    equ = b+"*"+c+"="+ans;
                    System.out.println(equ);
                    System.out.println(equ.length());
                    break;
            }
        }
    }
}