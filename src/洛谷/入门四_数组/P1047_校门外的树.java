package 洛谷.入门四_数组;

import java.util.Arrays;
import java.util.Scanner;

public class P1047_校门外的树 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int l = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[l+1];
        Arrays.fill(arr,1);
        for(int i = 0;i<s;i++) {
            int min = sc.nextInt();
            int max = sc.nextInt();
            for(int a = min;a<=max;a++) {
                arr[a] = 0;
            }
        }
        Arrays.sort(arr);
        int n = 0;
        for(int i = arr.length;i>0;i--) {
            if(arr[i-1] !=  0)
                n++;
            else
                break;
        }
        System.out.println(n);

    }
}