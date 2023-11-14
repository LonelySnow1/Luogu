package 洛谷.入门三_循环结构;

import java.util.Scanner;

public class P1089_津津的储蓄计划 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int b = 0;
                int sum = 0;
                int save = 0;
                int m = 0;
                boolean d = true;
                for(int i = 1;i<=12;i++){
                        int a = sc.nextInt();
                        b = 300 + sum - a;
                        if(b/100>=0){
                                save += b/100;
                                sum = b - b/100*100;
                        }
                        if(b<0) {
                                m = i;
                                System.out.println("-" + m);
                                d = false;
                                break;
                        }
                }
                if(d){
                        int e = (int) (sum+save*100*1.2);
                        System.out.printf("%d",e);
                }
        }
}
