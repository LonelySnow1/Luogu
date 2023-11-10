package 洛谷.字符串;

import java.util.Scanner;

public class P1765_手机 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //可以按照下面这样打表，也可以打 26 个字母每个需要按多少下的表
        //即 int[] arr={1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,4,1,2,3,1,2,3,4};
        String s1 = "adgjmptw ";
        String s2 = "behknqux";
        String s3 = "cfilorvy";
        String s4 = "sz";
        int ans = 0;
        String str = sc.nextLine();
        for(int i = 0;i<str.length();i++){
                if(s1.indexOf(str.charAt(i)) != -1)
                    ans +=1;
                if(s2.indexOf(str.charAt(i)) != -1)
                    ans +=2;
                if(s3.indexOf(str.charAt(i)) != -1)
                    ans +=3;
                if(s4.indexOf(str.charAt(i)) != -1)
                    ans +=4;
        }
        System.out.println(ans);
    }
}