package 洛谷.数组;

import java.util.Scanner;

public class P1789_插火把 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        boolean[][] arr = new boolean[n][n];
        for(int i = 0;i<m;i++){
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1 ;
            for(int a = x-1;a<=x+1;a++){
                for(int b = y-1;b<=y+1;b++){
                    try{
                        arr[a][b] = true;
                    }catch (Exception e){}
                }
            }
            try{arr[x-2][y] = true;}catch (Exception e){}
            try{arr[x][y-2] = true;}catch (Exception e){}
            try{arr[x][y+2] = true;}catch (Exception e){}
            try{arr[x+2][y] = true;}catch (Exception e){}
        }
        for(int i = 0;i<k;i++){
            int x = sc.nextInt() - 1 ;
            int y = sc.nextInt() - 1;
            for(int a = x-2;a<=x+2;a++){
                for(int b = y-2;b<=y+2;b++){
                    try{
                        arr[a][b] = true;
                    }catch (Exception e){}
                }
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(!arr[i][j])
                    ans++;
            }
        }
        System.out.println(ans);
    }
}