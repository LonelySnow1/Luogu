package 洛谷.数组;

import java.util.Scanner;

public class P1319_压缩技术 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = true;
        int num = 0;
        int sum = 0;
        while (sum != n*n){
            int b = sc.nextInt();
            sum +=b;
            for(int c =0;c<b;c++){
                if(check)
                    System.out.print(0);
                else
                    System.out.print(1);
                num++;
                if(num == n) {
                    System.out.println();
                    num = 0;
                }
            }
            check = !check;
        }
    }
}