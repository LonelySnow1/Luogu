package 洛谷.入门六_函数与结构体;

import java.util.Scanner;

public class P5742_评等级 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Score2[] ss = new Score2[n];
        for (int i = 0; i < n; i++) {
            sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            ss[i] = new Score2(s2, s3);
            compare(ss[i]);
        }

    }

    public static void compare(Score2 a) {
        if (a.syn() >= 800 && a.sum > 140)
            System.out.println("Excellent");
        else
            System.out.println("Not excellent");

    }
}

class Score2 {
    int s2, s3, sum;

    public Score2(int s2, int s3) {
        this.s2 = s2;
        this.s3 = s3;
        this.sum = s2 + s3;
    }

    public int syn() {
        return this.s2 * 7 + this.s3 * 3;
    }

}