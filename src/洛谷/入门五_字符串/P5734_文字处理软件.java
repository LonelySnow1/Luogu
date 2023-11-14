package 洛谷.入门五_字符串;

import java.util.Scanner;

public class P5734_文字处理软件 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        String s1 = "";
        int q = sc.nextInt();
        String str = sc.next();
        for(int i = 0 ;i < q;i++){
            int o = sc.nextInt();
            switch (o){
                case 1:
                    s1 = sc.next();
                    str = str+s1;
                    System.out.println(str);
                    break;
                case 2:
                    a = sc.nextInt();
                    b = sc.nextInt();
                    str = str.substring(a,a+b);
                    System.out.println(str);
                    break;
                case 3:
                    a = sc.nextInt();
                    s1 = sc.next();
                    StringBuilder sb = new StringBuilder(str);
                    sb.insert(a,s1);
                    str = sb.toString();
                    System.out.println(str);
                    break;
                case 4:
                    s1 = sc.next();
                    System.out.println(str.indexOf(s1));
            }
        }
    }
}