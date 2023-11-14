package 洛谷.入门二_分支结构;

import java.util.Scanner;

public class P5714_肥胖问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = (a/(b*b))*10;
        if(c<185)
            System.out.println("Underweight");
        else if(c < 240)
            System.out.println("Normal");
        else
            System.out.printf("%.4f\nOverweight",c/10);
    }
}
