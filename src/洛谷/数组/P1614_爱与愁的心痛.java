package 洛谷.数组;

import java.util.Scanner;

public class P1614_爱与愁的心痛 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int m = sc.nextInt();
                int[] arr =new int[n];
                int a = 0,min = 0,b = 0;
                for(int i = 0;i<n;i++){
                        arr[i] = sc.nextInt();
                        if(a < m){
                                min += arr[i];
                                a++;
                                b  = min;
                        }
                        else{
                                b = b-arr[i-m]+arr[i];//新建变量b的原因：如果直接用min进行操作的话，不满足if min就不会更新，会导致min的更新滞后，无法与i同步
                                if(min>b)
                                        min = b;
                        }
                }
                System.out.println(min);
        }
}