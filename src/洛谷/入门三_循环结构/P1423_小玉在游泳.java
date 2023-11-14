package 洛谷.入门三_循环结构;

import java.util.Scanner;

public class P1423_小玉在游泳 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = 2;
        double c = 2;
        int n = 1;
        for(;;){
            if(c<a) {
                b *= 0.98;
                c += b;
                n++;
            }
            else{
                System.out.println(n);
                break;
            }
        }
    }
}
