package 洛谷.入门三_循环结构;

import java.util.Scanner;

public class P5724_求极差_最大跨度值 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 1000,max = 0;
        for(int i = 0;i<n;i++) {
            int a = sc.nextInt();
            if(a>max)
                max = a;
            if(a<min)
                min = a;
        }
        int c = max - min;
        System.out.println(c);
    }
}
