package 洛谷.字符串;

import java.util.Arrays;
import java.util.Scanner;
//此题坑点也很多
//看清题面 ： 正规输入，非正规输入都要考虑，无可用结果输出0

public class P1603_斯诺登的密码 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "a+one+anther+first two+both+second three+third four five six seven eight nine ten eleven twelve thirteen fourteen fifteen sixteen seventeen eighteen nineteen twenty";
        String s2 = sc.nextLine();
        String s3 = "";
        int[] arr = new int[6];
        String[] sp2 = s2.split(" ");
        String[] sp1 = s1.split(" ");
        for(int i = 0;i<6;i++){
            for(int m = 0;m<sp1.length;m++){
                if(sp1[m].contains(sp2[i])) {
                    arr[i] = m + 1;
                    break;
                }
            }
        }
        for(int i = 0;i<arr.length;i++)
            arr[i] = arr[i]*arr[i] % 100;
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++) {
            if(arr[i]<10)
                s3 = s3 + '0';
            s3 = s3 + arr[i];
        }
        s3 = s3.replaceAll("^(0+)","");
        if(s3.length() == 0)
            s3 = "0";
        System.out.println(s3);
    }
}