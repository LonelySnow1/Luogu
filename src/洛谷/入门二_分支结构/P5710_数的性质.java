package 洛谷.入门二_分支结构;

import java.util.Scanner;

public class P5710_数的性质 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x[] = new int[4];
        x[0] = x[1] = 0;
        x[2] = 1;
        x[3] = 2;
        int a = sc.nextInt();
        if ((a%2) == 0) {
            x[0] += 1;
            x[1] += 2;
            x[2] += 1;
            x[3]  = 0;
        }
        if(a>4 && a<=12) {
            x[0] += 1;
            x[1] += 2;
            x[2] += 1;
            x[3]  = 0;
        }
        for(int i = 0;i<x.length;i++) {
            if(x[i] == 2 || x[i] == 4)
                x[i] = 1;
            else
                x[i] = 0;
            System.out.printf("%d ",x[i]);
        }

    }
}
