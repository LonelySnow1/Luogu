package 洛谷.函数与结构体;

import java.util.Scanner;

public class P5738_歌唱比赛 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double score = 0;
        for(int i = 0 ;i<a;i++){
            int s = 0;
            int m = 0;
            int n = 10;
            for(int k = 0;k<b;k++){
                int c = sc.nextInt();
                s +=c;
                if(c<n)
                    n = c;
                if(c>m)
                    m = c;
            }
            double s1 = (s-m-n)/(b-2.0);
            if(s1 > score)
                score = s1;
        }
        System.out.printf("%.2f",score);
    }
}