package 洛谷.字符串;

import java.util.Scanner;

//还有问题制约了运算速度 ： 数字无法直接转换为变量，需要进行转化，多重if嵌套
//改进后的代码在最下面
public class P1597_语句解析 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int x;
        String str = sc.nextLine();
        for(int i = 0;i < str.length()/5;i++){
            int d = str.charAt(3+i*5);
            if(d <= '9') x = d - '0';
            else if(d - 'a' == 0) x = a;
                else if(d - 'a' == 1) x= b;
                    else x = c;
            switch (str.charAt(i*5)-'a'){
                case 0:
                    a = x;
                    break;
                case 1:
                    b = x;
                    break;
                case 2:
                    c = x;
            }
        }
        System.out.printf("%d %d %d",a,b,c);
    }
}

//import java.util.*;
//public class Main {
//    //较上一方法优化约55ms
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int[] arr = new int[3];
//        for(int i = 0;i<str.length()/5;i++){
//            int a = str.charAt(i*5) - 'a';
//            int b = str.charAt(3+i*5);
//            arr[a] = b<='9'?b-'0':arr[b-'a'];
//        }
//        System.out.printf("%d %d %d",arr[0],arr[1],arr[2]);
//    }
//}