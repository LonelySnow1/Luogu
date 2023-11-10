package 洛谷.循环结构;

import java.util.Scanner;

public class P5726_打分 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int max = 0,min = 10;
                int sum = 0;
                for(int i = 0;i<n;i++){
                        int a = sc.nextInt();
                        sum+=a;
                        if(a<min)
                                min = a;
                        if(a>max)
                                max = a;
                }
                sum = sum - min - max;
                double n1 = n-2;
                double avg = sum/n1;
                System.out.printf("%.2f",avg);
        }
}
