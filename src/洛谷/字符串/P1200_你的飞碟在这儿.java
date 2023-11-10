package 洛谷.字符串;

import java.util.Scanner;

public class P1200_你的飞碟在这儿 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int a = 1;
        int b = 1;
        for(int i = 0; i<Math.max(s1.length(),s2.length());i++) {
            if (i < s1.length())
                a *= (s1.charAt(i) - 'A' + 1);
            if (i < s2.length())
                b *= (s2.charAt(i) - 'A' + 1);
        }
        if(b%47 == a%47)
            System.out.println("GO");
        else
            System.out.println("STAY");
    }
}