package 洛谷.入门三_循环结构;

import java.util.Scanner;

public class P5722_数列求和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = sc.nextInt();
        for(int i = 0;i<=a;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
