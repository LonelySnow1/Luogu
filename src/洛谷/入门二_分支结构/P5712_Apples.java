package 洛谷.入门二_分支结构;

import java.util.Scanner;

public class P5712_Apples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a <= 1)
            System.out.printf("Today, I ate %d apple.",a);
        else
            System.out.printf("Today, I ate %d apples.",a);
    }
}
