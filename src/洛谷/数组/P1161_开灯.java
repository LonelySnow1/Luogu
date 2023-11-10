package 洛谷.数组;
//用list会超时
import java.util.Scanner;

public class P1161_开灯 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                boolean[] b= new boolean[2000000];
                double[] a = new double[n];
                int[] t = new int[n];
                for(int i = 0; i<n;i++){
                        a[i] = sc.nextDouble();
                        t[i] = sc.nextInt();
                        for(int k = 1;k<=t[i];k++)
                                b[(int)Math.floor(a[i]*k)] = !b[(int)Math.floor(a[i]*k)];
                }
                for(int k = 0;k<2000000;k++){
                        if(b[(int)Math.floor(k)]){
                                System.out.println(k);
                                break;
                        }
                }
        }
}