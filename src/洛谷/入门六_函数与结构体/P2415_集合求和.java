package 洛谷.入门六_函数与结构体;

import java.util.Scanner;

//注：这题用int会超范围！！！！！用long或者高精度
//集合的真子集数为 2^n - 1   n --> 集合中元素个数
//所有子集中，元素出现次数   2^(n-1)
public class P2415_集合求和 {
    public static void main(String[] args) {
        long sum = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] ss = s.split(" ");
        for(int i = 0;i<ss.length;i++){
            int num = Integer.parseInt(ss[i]);
            sum += num * Math.pow(2,ss.length-1);
        }
        System.out.println(sum);
    }
}