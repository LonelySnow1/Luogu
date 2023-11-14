package 洛谷.入门二_分支结构;

import java.util.Scanner;

public class P1085_不高兴的津津 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int n = 0;
        int[] arr = new int[14];
        for (int i = 0; i < 14; i++)
            arr[i] = sc.nextInt();
        for (int k = 0; k < 7; k++) {
            if (a < arr[2 * k] + arr[2 * k + 1]) {
                a = arr[2 * k] + arr[2 * k + 1];
                n = k;
            }
        }
        if (a > 8)
            System.out.println(n + 1);
        else
            System.out.println(0);
    }
}