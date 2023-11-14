package 洛谷.入门四_数组;
//还有一种方法，就是让这个数一圈圈的转，转圈的四步写道一个循环里，让他们依次执行
import java.util.Scanner;

public class P5731_蛇形方阵 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0, y = 0;
        int[][] arr = new int[n][n];
        int a = 1;
        arr[0][0] = 1;
        for(int i = 2;i<=n*n;i++){
            if(a == 1 && (y==n-1 || arr[x][y+1] != 0)){
                a++;
            }
            else if(a == 2 && (x==n-1 || arr[x+1][y] != 0)){
                a++;
            }
            else if(a == 3 && (y==0 || arr[x][y-1] != 0)){
                a++;
            }
            else if(a==4 &&(x==0 || arr[x-1][y] != 0)){
                a = 1;
            }
            switch(a){
                case 1: y++;break;
                case 2: x++;break;
                case 3: y--;break;
                case 4: x--;break;
            }
            arr[x][y] = i;
        }
        for(int i = 0;i<n;i++){
            for(int k = 0;k<n;k++){
                System.out.printf("%3d",arr[i][k]);
            }
            System.out.println();
        }
    }
}