package 洛谷.入门五_字符串;

import java.util.Arrays;
import java.util.Scanner;

public class P1598_垂直柱状图 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        String s4 = sc.nextLine();
        String s = s1+s2+s3+s4;
        int[] arr = new int[26];
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) - 'A'>=0)
                arr[s.charAt(i) - 'A']++;
        }
        int[] a1 = Arrays.copyOf(arr,26);
        Arrays.sort(a1);
        int a = a1[25];
        for(int i = 0;i<a1[25];i++){
            for(int k = 0;k<arr.length;k++){
                if(k != arr.length-1) {
                    if (arr[k] - a >= 0) {
                        System.out.print("* ");
                    } else
                        System.out.print("  ");
                }
                else {
                    if (arr[k] - a >= 0) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
            }
            a--;
            System.out.println();
        }
        System.out.print("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
    }
}