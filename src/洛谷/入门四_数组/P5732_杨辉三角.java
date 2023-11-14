package 洛谷.入门四_数组;

import java.util.Scanner;

public class P5732_杨辉三角 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        arr[0][0] = 1;
        for(int i = 1;i<n;i++){
            for(int  k = 0;k<=i;k++){
                if(k==i || k==0)
                    arr[i][k] = 1;
                else{
                    arr[i][k] = arr[i-1][k-1]+arr[i-1][k];
                }
            }
        }
        for(int i = 0;i<n;i++){
            for(int  k = 0;k<=i;k++){
                System.out.printf("%d ",arr[i][k]);
            }
            System.out.println();
        }
    }
}