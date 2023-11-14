package 洛谷.入门四_数组;

import java.util.Scanner;

public class P5728_旗鼓相当的对手 {
        public static void main(String[] args) {
                Scanner sc  = new Scanner(System.in);
                int n = sc.nextInt();
                int a,b,c,sum,ans = 0;
                int[][] arr = new int[n][4];
                for(int i = 0;i<n;i++){
                        a = sc.nextInt();
                        b = sc.nextInt();
                        c = sc.nextInt();
                        sum = a+b+c;
                        int[] item = {sum,a,b,c};
                        arr[i] = item;
                }
                for(int i = 0;i<n;i++){
                        int sum1 = arr[i][0];
                        for(int m = i+1;m<n;m++){
                                int sum2 = arr[m][0];
                                if(Math.abs(sum1 -sum2)<=10){
                                        if(Math.abs(arr[i][1]-arr[m][1])<=5 &&Math.abs(arr[i][2]-arr[m][2])<=5 &&Math.abs(arr[i][3]-arr[m][3])<=5 ){
                                                ans++;
                                        }
                                }
                        }
                }
                System.out.println(ans);
        }
}