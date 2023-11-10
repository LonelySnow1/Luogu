package 洛谷.数组;

import java.util.ArrayList;
import java.util.Scanner;

public class P1320_压缩技术_续集版 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        int n = 200,num = 0;
        int x = 0,y = 0;
        ArrayList b = new ArrayList();
       while(num != n) {
           a = sc.nextLine();
           n = a.length();
            for (int i = 0; i < n; i++) {
                int c = a.charAt(i) - '0';
                if (c == 0) {
                    x++;
                    if (y != 0) {
                        b.add(y);
                        y = 0;
                    }
                }
                else {
                    y++;
                    if (x != 0 || (num+i) ==0) { //本题坑点——第一个数必须是零的个数【这里保证了num（行数）和i（字符序号）都必须为0
                        b.add(x);
                        x = 0;
                    }
                }
            }
            num++;
        }
        System.out.printf("%d ",n);
        b.add(x==0?y:x);
        for(int i = 0;i<b.size();i++){
            System.out.printf("%d ",b.get(i));
        }
    }
}