package 洛谷.入门六_函数与结构体;

import java.util.Scanner;

public class P5461_赦免战俘 {

    /*
        思路：将最上面的数组向下复制两次，再将这一整体当作数组，再次进行复制操作
             下面是自己写的，改良版在最后
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = (int)Math.pow(2,a);
        boolean[][] ans = new boolean[b][b];
        ans[0][b-1] = true;
        for(int c = 0;c<a;c++){
            int diff = 1;
            for(int i = 0;i<2;i++){
                for(int m = 0;m<(int)Math.pow(2,c);m++){
                    int d  = (int) Math.pow(2, c);

                    /*for(int n = 0 ;n<(int)Math.pow(2,c);n++)
                       ans[(int)Math.pow(2,c+1)-1-m][b-(int)(Math.pow(2,c+1)/diff)+n] = ans[(int)Math.pow(2,c)-1-m][b-(int)(Math.pow(2,c))+n];
                          直接这样写最后一个测试点会超时，idea自动简化为下面格式，简化之后的代码不会超时 */

                        System.arraycopy(ans[d - 1 - m], b - d, ans[d*2 - 1 - m], b - (d*2 / diff), d);
                    //等第一处全部拷贝完成后，再去拷贝第二处

                }
                diff = 2;
            }
        }
        for(int i = 0 ;i<b;i++){
            for(int k = 0;k<b;k++){
                if(ans[i][k])
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}


//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    //改良版，比原版快0.7s左右
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = (int)Math.pow(2,sc.nextInt());
//        int[][] a = {{0, 1}, {1, 1}};
//        int[][] d = d(a, n);
//        for (int[] ints : d) {
//            System.out.println(Arrays.toString(ints).substring(1, n * 3-1).replaceAll(", "," "));
//            /*
//                不加substring 和 replaceAll 的结果是下面这样的：
//                [0, 0, 0, 1]
//                [0, 0, 1, 1]
//                [0, 1, 0, 1]
//                [1, 1, 1, 1]
//             */
//        }
//    }
//
//    private static int[][] d(int[][] a, double n) {
//        if (n != a.length) {
//            int c = a.length*2;//4
//            int t = a.length;//2
//            int [][] b = new int[c][c];//[4][4]
//            for (int i = 0; i < t; i++) {
//                System.arraycopy(a[i], 0, b[i], t, c - t);
//            }
//            for (int i = t; i < c; i++) {
//                for (int j = 0; j < c; j++) {
//                    b[i][j] = a[i-t][j%t];//j%t nb!!!  这个地方我是用再次循环解决，%真的神
//                }
//            }
//            return d(b,n);
//        }else {
//            return a;
//        }
//    }
//}