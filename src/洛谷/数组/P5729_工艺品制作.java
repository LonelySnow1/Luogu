package 洛谷.数组;

import java.util.ArrayList;
import java.util.Scanner;

public class P5729_工艺品制作 {
        public static void main(String[] args) {
                Scanner sc  = new Scanner(System.in);
                int a,b,c,n;
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                int sum = a*b*c;
                n = sc.nextInt();
                ArrayList arr = new ArrayList();
                for(int i = 0;i<n;i++){
                        int a1 = sc.nextInt();
                        int b1 = sc.nextInt();
                        int c1 = sc.nextInt();
                        int a2 = sc.nextInt();
                        int b2 = sc.nextInt();
                        int c2 = sc.nextInt();
                        for(int x = a1;x<=a2;x++){
                                for(int y = b1;y<=b2;y++){
                                        for(int z = c1;z<=c2;z++){
                                                String num = x + " " + y + " " + z;
                                                if(!arr.contains(num))
                                                        arr.add(num);
                                        }
                                }
                        }
                }
                System.out.println(sum-arr.size());
        }
}