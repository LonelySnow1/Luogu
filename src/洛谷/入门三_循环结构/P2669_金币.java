package 洛谷.入门三_循环结构;

import java.util.Scanner;

public class P2669_金币 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 1;
        int sum = 0;
        int i = 0;
        int k = sc.nextInt();
        for(;;){
            for(int l = 1;l<=m;l++){
                sum += m;
                i++;
                if(l == m){
                    m++;
                    break;
                }
                if(i == k)
                    break;
            }
            if(i == k)
                break;
        }
        System.out.println(sum);
    }
}
