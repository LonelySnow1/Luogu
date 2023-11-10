package 洛谷.循环结构;

import java.util.Scanner;

public class P5725_求三角形 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int n1 = 0;
                int c = 1;
                for(int i = 1; i<= n*n;i++){
                        System.out.printf("%02d",i);
                        if(i%n == 0)
                                System.out.println();
                }
                System.out.println();
                for(int i = 1;i<=n;i++){
                        for(int a = 1;a<=(n-i)*2;a++)
                                System.out.printf(" ");
                        for(int b = 1;b<=i;b++){
                                System.out.printf("%02d",c);
                                n1++;c++;
                                if(n1 == i) {
                                        System.out.println();
                                        n1 = 0;
                                }

                        }
                }
        }
}
