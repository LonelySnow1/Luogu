package 洛谷.入门四_数组;

import java.util.Scanner;
//此题并未使用数组解决
public class P5730_显示屏 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int a = 0;
                int b;
                String arr = sc.next();
                String list =
                        "XXX...X.XXX.XXX.X.X.XXX.XXX.XXX.XXX.XXX" +
                        "X.X...X...X...X.X.X.X...X.....X.X.X.X.X" +
                        "X.X...X.XXX.XXX.XXX.XXX.XXX...X.XXX.XXX" +
                        "X.X...X.X.....X...X...X.X.X...X.X.X...X" +
                        "XXX...X.XXX.XXX...X.XXX.XXX...X.XXX.XXX";
                for(int i = 0;i<5;i++){//循环每一行
                        a = 39*i;//一行有39个数据，若凑整40，每行数据后加一个占位的即可
                        for(int k = 0;k<n;k++){//循环每个一行
                               b = arr.charAt(k);
                               b = (b-'0')*4 + a;
                               for(int m = b;m<b+3;m++)
                                       System.out.print(list.charAt(m));
                               if(k != n-1)
                                        System.out.print(".");
                        }
                        System.out.println();
                }
        }
}