package 洛谷.算法1_1_模拟与高精度;

import java.math.BigInteger;
import java.util.Scanner;

public class P1249_最大乘积 {
    public static void main(String[]args) {
        /*
            此题思路：从2开始拆解，拆到不能拆为止，将剩下的数从最后一位开始加，
         */
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        BigInteger mul = BigInteger.valueOf(1);
        int k = 2;
        int[] arr = new int[10000];
        if(num>4) {
            while (num - k >= 0) {
                num -= k;
                arr[k-2] = k;
                k++;//在最后一次的时候这里加了一次，所以之前是k-2，到了下面变成了k-3
            }
            int b = k-3;
            while(num>0){
                arr[b]++;
                b--;
                if(b<0)
                    b = k-3;
                num--;
            }
            for(int i = 0;i<k-2;i++){
                System.out.print(arr[i]+" ");
                mul=mul.multiply(BigInteger.valueOf(arr[i]));
            }
        }
        else{
            if(num == 3){
                System.out.println("1 3");
                System.out.println("3");
            }
            else{
                System.out.println("1 4");
                System.out.println("4");
            }
        }
        System.out.println();
        System.out.println(mul);
    }
}