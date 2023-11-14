package 洛谷.入门二_分支结构;

import java.util.Scanner;

public class P5711_闰年判断 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (((a % 4 == 0) && (a % 100 != 0)) || a % 400 == 0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
