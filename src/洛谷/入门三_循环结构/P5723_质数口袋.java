package 洛谷.入门三_循环结构;

import java.util.Scanner;

public class P5723_质数口袋 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int sum = 0;
        int n = 0;
        for(int m = 2;;m++){
            if(b(m)){
                sum+=m;
                if(sum>k)
                    break;
                n++;
                System.out.println(m);
            }
        }
        System.out.println(n);
    }
    static boolean b(int q){
        for(int a = 2;a<=Math.sqrt(q);a++){
            if(q%a == 0)
                return false;
        }
        return true;
    }
}
