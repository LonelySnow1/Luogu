package 洛谷.数组;
//还有种更简单的算法，列一个大小为34的数组，让正确的序号对应的值为true，其他都是false
//每输入一个数，直接调这个数组，直接就可以判断是否是中奖数字

import java.util.ArrayList;
import java.util.Scanner;

public class P2550_彩票摇奖 {
        public static void main(String[] args) {
                Scanner sc  = new Scanner(System.in);
                int[] ans = {0,0,0,0,0,0,0,0};
                ArrayList arr = new ArrayList();
                int n = sc.nextInt();
                for(int i = 0;i<7;i++)
                        arr.add(sc.nextInt());
                for(int i= 0;i<n;i++){
                        int s1 = 0;
                        for(int m = 0;m<7;m++){
                                if(arr.contains(sc.nextInt()))
                                        s1++;
                        }
                       ans[7-s1] += 1;
                }
                for(int i = 0;i<7;i++)
                        System.out.printf("%d ",ans[i]);
        }
}