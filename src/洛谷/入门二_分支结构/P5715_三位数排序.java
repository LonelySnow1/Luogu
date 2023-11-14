package 洛谷.入门二_分支结构;

import java.util.Scanner;

public class P5715_三位数排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int n = 0; n < 3; n++) {
            arr[n] = sc.nextInt();
        }
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 2; k++) {
                if (arr[k] > arr[k + 1]) {
                    int a = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = a;
                }
            }
            if(i == 1)
                System.out.printf("%d %d %d",arr[0],arr[1],arr[2]);
        }
    }
}