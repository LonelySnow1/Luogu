package 洛谷.入门三_循环结构;

import java.util.Scanner;

public class P4956_Davor {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int sum = sc.nextInt();
                int x = 1;
                int xm = 0;
                int k = 0;
                int km = 0;
                for(;x<=100;x++){
                        km = sum - 7*52*x;
                        if(km%(52*21) == 0 && km>0) {
                                xm = x;
                                k = km / (52 * 21);
                        }
                }
                System.out.println(xm);
                System.out.println(k);
        }
}
