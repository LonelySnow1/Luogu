package 洛谷.入门二_分支结构;

import java.util.Scanner;

public class P1046_陶陶摘苹果 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        a+=30;
        int n = 0;
        for(int i = 0;i<10;i++) {
            if(arr[i] <= a)
                n++;
        }
        System.out.println(n);
    }
}