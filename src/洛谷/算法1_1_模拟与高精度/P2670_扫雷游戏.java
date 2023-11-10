package 洛谷.算法1_1_模拟与高精度;

import java.util.Scanner;

//为了不使用过多的try catch来处理越界，故将坐标范围扩大一圈，避免越界发生
public class P2670_扫雷游戏 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] ans = new int[a+2][b+2];
        String str;
        sc.nextLine();
        for(int m = 1;m<=a;m++) {
            str = sc.nextLine();
            for (int n = 1; n <= b; n++) {
                if(str.charAt(n-1) == '*'){
                    ans[m-1][n-1]++;ans[m-1][n]++;ans[m-1][n+1]++;
                    ans[m][n-1]++;ans[m][n] = -10;ans[m][n+1]++;
                    ans[m+1][n-1]++;ans[m+1][n]++;ans[m+1][n+1]++;
                }
            }
        }
        for(int m = 1;m<=a;m++) {
            for (int n = 1; n <= b; n++) {
                if(ans[m][n]>=0)
                     System.out.print(ans[m][n]);
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}