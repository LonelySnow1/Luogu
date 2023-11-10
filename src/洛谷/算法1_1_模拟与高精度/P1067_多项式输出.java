package 洛谷.算法1_1_模拟与高精度;

import java.util.Scanner;

public class P1067_多项式输出 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        StringBuilder str = new StringBuilder();
        for(int i = 0;i<=n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = n;i>=0;i--){
            String a;
            int abs = Math.abs(arr[n - i]);
            if(arr[n-i]>0)
                a = "+";
            else
                a = "-";
            if(abs > 1 || (abs == 1 && i == 0))
                a += abs;
            else if(abs==0)
                continue;
            if(i>1)
                a += "x^"+i;
            else if (i == 1)
                a += "x";
            str.append(a);
        }
        if(arr[0] > 0)
             str = new StringBuilder(str.substring(1));
        System.out.println(str);
    }
}
