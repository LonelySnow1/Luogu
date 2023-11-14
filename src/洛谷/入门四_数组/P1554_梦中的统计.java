package 洛谷.入门四_数组;

import java.util.Scanner;

public class P1554_梦中的统计 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                int[] arr = {0,0,0,0,0,0,0,0,0,0};
                for(;a<=b;a++){
                    String c = String.valueOf(a);
                    for(int i = 0;i<c.length();i++){
                        int d = c.charAt(i) - '0';
                        arr[d]++;
                    }
                }
            for(int i = 0;i<10;i++)
                System.out.printf("%d ",arr[i]);
        }
}