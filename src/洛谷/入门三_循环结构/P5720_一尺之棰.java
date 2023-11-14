package 洛谷.入门三_循环结构;

import java.util.Scanner;

public class P5720_一尺之棰 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        int n = 1;
        while(true) {
            if(Math.floor(a/2) == 1) {
                n++;
                break;
            }
            else if(a==1) {
                break;
            }
            else {
                n++;
                a = Math.floor(a/2);
            }
        }
        System.out.println(n);
    }
}