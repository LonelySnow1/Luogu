package 洛谷.入门五_字符串;

import java.util.HashSet;
import java.util.Scanner;

public class P1321_单词覆盖还原 {
    //利用了哈希表的无序不重复特性
    //思想：还原 去重
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<Integer> B = new HashSet<>();
        HashSet<Integer> G = new HashSet<>();
        for(int i = 0;i<str.length();i++){
                switch (str.charAt(i)){
                    case '.':
                        continue;
                    case 'b':
                        B.add(i);
                        break;
                    case 'o':
                        B.add(i-1);
                        break;
                    case 'y':
                        B.add(i-2);
                        break;
                    case 'g':
                        G.add(i);
                        break;
                    case 'i':
                        G.add(i-1);
                        break;
                    case 'r':
                        G.add(i-2);
                        break;
                    case 'l':
                        G.add(i-3);
                        break;
            }
        }
        System.out.println(B.size());
        System.out.println(G.size());
    }
}


//import java.util.*;
//public class Main {
//    //方法二：逐次遍历'boy'和'girl'
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int B = 0;
//        int G = 0;
//        for(int i = 0;i<str.length()-2;i++)
//            if(str.charAt(i) == 'b' || str.charAt(i+1) == 'o' || str.charAt(i+2) == 'y')
//                B++;
//        for(int i = 0;i<str.length()-3;i++)
//            if(str.charAt(i) == 'g' || str.charAt(i+1) == 'i' ||str.charAt(i+2) == 'r' ||str.charAt(i+3) == 'l' )
//                G++;
//        System.out.println(B);
//        System.out.println(G);
//    }
//}