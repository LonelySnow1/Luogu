package 洛谷.算法1_1_模拟与高精度;

import java.util.Scanner;

public class P4924_魔法少女小Scarlet {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x,y,r,z;
        int[][] arr = new int[510][510];
        int[][] arr1 = new int[510][510];
        int a = 1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = a;
                arr1[i][j] = a;
                a++;
            }
        }

        for(int i = 0 ; i < m;i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            r = sc.nextInt();
            z = sc.nextInt();
            swap(x,y,r,z,n,arr,arr1);
        }
        pt(n,arr);
    }
    public static void pt(int n,int[][] arr){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void swap(int x,int y,int r,int z,int n,int[][] arr1,int[][] arr2){
        if (z == 0) {
            for (int i = -r; i <= r; i++) {
                for (int j =- r; j <= r; j++) {
                    arr2[x-1+i][y-1+j] = arr1[x-1-j][y-1+i];
                }
            }
        }
        if (z == 1) {
            for (int i = - r; i <= r; i++) {
                for (int j = - r; j <= r; j++) {
                    arr2[x-1+i][y-1+j] = arr1[x-1+j][y-1-i];
                }
            }
        }
        for(int i = 0;i<n;i++)
            System.arraycopy(arr2[i],0,arr1[i],0,arr2.length);
    }
}
