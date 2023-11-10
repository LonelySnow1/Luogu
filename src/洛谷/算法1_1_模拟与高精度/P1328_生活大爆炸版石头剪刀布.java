package 洛谷.算法1_1_模拟与高精度;

import java.util.Scanner;

public class P1328_生活大爆炸版石头剪刀布 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int NA = sc.nextInt();
        int NB = sc.nextInt();
        int[] A = new int[NA];
        int[] B = new int[NB];
        int a = 0;
        int b = 0;
        int[] s = {0,0};
        for(int i = 0;i<NA;i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0;i< NB;i++){
            B[i] = sc.nextInt();
        }
        for(int i = 0 ;i < N;i++){
            while(a+i>=NA)
                a = a - NA;
            while(b+i>=NB)
                b = b - NB;
            //上面四行代码功能可以用对 NA/NB取余实现
            compare(A[a+i],B[b+i],s);
        }
        System.out.print(s[0]+" "+s[1]);
    }
    public static void compare(int a,int b,int[] s){
        int[][] C = {{0,0,1,1,0},{1,0,0,1,0},{0,1,0,0,1},{0,0,1,0,1},{1,1,0,0,0}};
        s[0] += C[a][b];
        s[1] += C[b][a];
    }
}
