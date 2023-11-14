package 洛谷.入门六_函数与结构体;

import java.util.Scanner;

public class P5741_旗鼓相当的对手_加强版 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Score1[] ss = new Score1[n];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            ss[i] = new Score1(str, s1, s2, s3);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int k = i + 1; k < n; k++) {
                ss[i].compare(ss[k]);
            }
        }

    }
}

class Score1 {
    private String name;
    private int s1, s2, s3, sum;

    public Score1(String name, int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.name = name;
        this.sum = s1 + s2 + s3;
    }

    public void compare(Score1 o) {
        if (Math.abs(this.sum - o.sum) <= 10) {
            if (Math.abs(this.s1 - o.s1) <= 5 && Math.abs(this.s2 - o.s2) <= 5 && Math.abs(this.s3 - o.s3) <= 5)
                System.out.println(this.name + " " + o.name);
        }
    }

}
