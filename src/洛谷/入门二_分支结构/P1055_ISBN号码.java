package 洛谷.入门二_分支结构;

import java.util.Scanner;

public class P1055_ISBN号码 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = 0;
        int n = 0;
        for (int i = 0; i < 11; i++) {
            if (str.charAt(i) == '-')
                continue;
            else {
                n++;
                a += ((int) str.charAt(i) - 48) * n;
            }
        }
        String c = a%11+"";
        if ((int) str.charAt(str.length() - 1) == ((a%11 + '0')>'9'?'X':(a%11+'0')))
            System.out.println("Right");
        else
            System.out.printf("%11.11s-%s", str, c.equals("10")?"X":c);
    }
}