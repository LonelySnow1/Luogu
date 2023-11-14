package 洛谷.入门四_数组;

import java.util.Arrays;
import java.util.Scanner;

public class P2911_BovineBonesG {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int[] arr = new int[a+b+c+1];
                Arrays.fill(arr,0);
                for(int i = 1;i<=a;i++){
                        for(int k = 1;k<=b;k++){
                                for(int m = 1;m<=c;m++){
                                        arr[i+k+m]++;
                                }
                        }
                }
                int m = 0,max = 0;
                for(int i = 2;i<a+b+c;i++){
                        if(max<arr[i]){
                                max = arr[i];
                                m = i;
                        }
                }
                System.out.println(m);
        }
}
/*
*此种方式时间复杂度为 O(1), 非常好方法
* 简述下具体思路，列表可知两枚骰子的时候，概率最多的分布集中在 a+1 ~ b+1 之间（b>=a）
* 将上表想象成线段，就可得到一个 2~a+b 的线段 ，其中概率分布最多的还是位于 a+1 ~ b+1处 共 b-a+1 个点
* 将第三枚骰子也抽象为一条长度为c的线段，可以想象，将线段c放到线段ab上时，c所覆盖的面积就是c在ab上右端点的概率之和
* 因为一个数，左一（这个数的左边第一个）+1 = 左二 +2 = 左三 + 3 。。。  = 这个数本身
* 所以当线段c处于a+1 ~ b+1 之间时，概率时最高的
* 故 当 c <= b-a+1时 ans = a+1+c
* 当 c> b-a+1时，为了保持和最小，需要尽可能使c偏左 ans = 1+max+(d - (max - min + 1))/2 + 1;
* 详见此题题解第一个
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int max = Math.max(a,Math.max(b,c));
                int min = Math.min(a,Math.min(b,c));
                int d = a+b+c-max-min;
                int ans;
                if(d<=max-min+1)
                        ans = 1+min+d;
                else
                        ans = 1+max+(d - (max - min + 1))/2 + 1;
                System.out.println(ans);
        }
}
*/