package 洛谷.循环结构;

import java.util.Scanner;

public class P1420_最长连号 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int b = sc.nextInt();
            int max = 1;
            int m = 1;
            for(int i = 0; i<n-1;i++){
                int a = sc.nextInt();
                if(b+1 == a){
                    m++;
                }
                else{
                    m = 1;
                }
                if(m>max)
                    max = m;
                b = a;
            }
            System.out.println(max);
        }
}
