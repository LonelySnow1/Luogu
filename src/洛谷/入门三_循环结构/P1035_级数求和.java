package 洛谷.入门三_循环结构;

import java.util.Scanner;

public class P1035_级数求和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        double sum = 0;
        for(int i = 1;;i++){
            sum += 1.0/i;
            if(k<sum) {
                k = i;
                break;
            }
        }
        System.out.println(k);
    }
}
