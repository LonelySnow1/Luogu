package 洛谷.入门四_数组;
/*
* 此题自己写的方法是暴力模拟，但是使用java模拟容易超过1s，故用如下思路更好
* 模拟罗伯法：
* 我们可以看出：第一行中点开始，把每一个下面的数放到“右上角”，若右上角有数，则放到正下方。
* 这个思路需要我们将幻方打开，拓展一下，每次出格做一个判断即可
* 这样可减少很多if-else的使用
*/
import java.util.Scanner;

public class P2615_神奇的幻方 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[][] arr = new int[n][n];
                arr[0][n/2] = 1;
                int x = 0;
                int y = n/2;
                for(int i = 2;i<=n*n;i++){
                        if(x == 0){
                                if(y != n-1){
                                        x = n-1;
                                        y = y+1;
                                }
                                else if(y == n-1)
                                        x += 1;
                        }
                        else {
                                if(y == n-1){
                                        y = 0;
                                        x -=1;
                                }
                                else{
                                        if(arr[x-1][y+1] + 1 == 1){
                                                x -=1;
                                                y +=1;
                                        }
                                        else
                                                x += 1;
                                }
                        }
                        arr[x][y] = i;
                }
                for(int i = 0;i<n;i++){
                        for(int k = 0;k<n;k++){
                                System.out.printf("%d ",arr[i][k]);
                        }
                        System.out.println();
                }
        }
}
/*
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[][] arr = new int[n][n];
                arr[0][n/2] = 1;
                int x = 0;
                int y = n/2;
                for(int i = 2;i<=n*n;i++) {
                        int x1 = x-1<0?n-1:x-1;
                        int y1 = y+1>n-1?0:y+1;
                        int x2 = x+1>n-1?0:x+1;
                        if(arr[x1][y1]+1==1){
                                x = x1;
                                y = y1;
                        }
                        else{
                                x = x2;
                        }
                        arr[x][y] = i;
                }
                for(int i = 0;i<n;i++){
                        for(int k = 0;k<n;k++){
                                System.out.printf("%d ",arr[i][k]);
                        }
                        System.out.println();
                }
        }
}
*/