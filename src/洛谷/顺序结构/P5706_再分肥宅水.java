package 洛谷.顺序结构;/*
题目描述
现在有 t 毫升肥宅快乐水，要均分给 n 名同学。每名同学需要 2 个杯子。现在想知道每名同学可以获得多少毫升饮料（严格精确到小数点后 3 位），以及一共需要多少个杯子。

输入格式
输入一个实数 t 和一个正整数 n，使用空格隔开。

输出格式
输出两行。

第一行输出一个三位小数，表示可以获得多少毫升饮料。第二行输出一个正整数，表示一共需要多少个杯子。
 */

import java.util.Scanner;
public class P5706_再分肥宅水 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        int b = sc.nextInt();
        float c = a/b;
        int d = b*2;
        System.out.printf("%.3f\n",c);
        System.out.printf("%d",d);
    }
}