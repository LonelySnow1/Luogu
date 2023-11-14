package 洛谷.算法1_2_排序;

import java.util.Scanner;

//此题极易爆空间或者爆时间
//如果直接Arrays.sort()会爆空间
//这种方法直接在while中打印会爆时间
public class P1271_选举学生会 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 0;i<m;i++){
            arr[sc.nextInt()]++;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 1;i<=n;i++){
            while(arr[i]>0) {
                stringBuffer.append(i + " ");
                arr[i]--;
            }
        }
        System.out.println(stringBuffer);
    }
}