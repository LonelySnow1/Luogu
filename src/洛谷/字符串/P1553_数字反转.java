package 洛谷.字符串;

import java.util.Scanner;

public class P1553_数字反转 {
    public static void main(String[] args) {
        //此题坑点非常多
        //给出三个易错数
        //0.00   1234567890/1234567890    1234567890%
        Scanner sc = new Scanner(System.in);
        String o = "/.%";
        String str = sc.nextLine();
        String s1 = "";
        String s2 = "";
        String a = "";
        boolean t = true;
        for(int i  = 0;i < str.length();i++){
            if(!o.contains(str.charAt(i)+"") && t) {
                s1 = str.charAt(i) + s1;
            }
            else {
                t = false;
                a = a+str.charAt(i);
                s2 = str.charAt(i) + s2;
            }
        }
        s1 = s1.replaceAll("^(0+)","");
        s1 = s1.length() == 0?"0":s1;
        if(a.length()>1) {
            s2 = s2.substring(0, s2.length() - 1);
            if(a.charAt(0) == '.')
                s2 = s2.replaceAll("(0+)$","");
            else
                s2 = s2.replaceAll("^(0+)","");
            s2 = s2.length() == 0?"0":s2;
            System.out.println(s1+a.charAt(0)+s2);
        }
        else
            System.out.println(s1+a);
    }
}