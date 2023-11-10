package 洛谷.算法1_1_模拟与高精度;

import java.util.Scanner;

public class P1098_字符串的展开 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();
        String str = sc.next();
        int start = 1;
        while (str.indexOf("-",start) != -1 && str.indexOf("-",start) != str.length()-1 ) {
            String s = "";
            int a = str.indexOf("-",start);
            String s1 = ""+str.charAt(a-1)+str.charAt(a)+str.charAt(a+1);
            start = a+1;
            if(str.charAt(a-1)=='-' || str.charAt(a+1)=='-' )
                continue;
            if (str.charAt(a - 1) < str.charAt(a + 1) && str.charAt(a - 1) + 1 != str.charAt(a + 1) && (str.charAt(a + 1)-str.charAt(a - 1)<('a'-'9'))) {
                if (p3 == 1) {
                    for (int i = str.charAt(a - 1) + 1; i < str.charAt(a + 1); i++) {
                        char c = (char) i;
                        for (int n = 0; n < p2; n++) {
                            s += c;
                        }
                    }
                } else {
                    for (int i = str.charAt(a + 1) - 1; i > str.charAt(a - 1); i--) {
                        char c = (char) i;
                        for (int n = 0; n < p2; n++) {
                            s += c;
                        }
                    }
                }
                switch (p1) {
                    case 1:
                        s = s.toLowerCase();
                        break;
                    case 2:
                        s = s.toUpperCase();
                        break;
                    case 3:
                        s = s.replaceAll(".", "*");
                        break;
                }
            } else if (str.charAt(a - 1) + 1 == str.charAt(a + 1))
                s = "";
            else if(str.charAt(a - 1) > str.charAt(a + 1))
                s= "-";
            else
                continue;
            String s2 = str.charAt(a-1)+s+str.charAt(a+1);
            str = str.replace(s1,s2);
        }
        System.out.println(str);
    }
}
