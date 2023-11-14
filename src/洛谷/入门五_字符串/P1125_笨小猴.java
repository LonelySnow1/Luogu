package 洛谷.入门五_字符串;

import java.util.Scanner;

public class P1125_笨小猴 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        int max = 1;
        int min = 100;
        boolean ansb = false;
        String str = sc.nextLine();
        for(int i = 0;i<str.length();i++){
            int a = str.charAt(i)-'a';
            arr[a]++;
        }
        for(int i = 0 ;i<26;i++){
            if(arr[i]!=0) {
                if (arr[i] < min)
                    min = arr[i];
                if (arr[i] > max)
                    max = arr[i];
            }
        }
        int ans = max- min;
        int[] pri = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};//打表
        for (int j : pri) {
            if (ans == j) {
                ansb = true;
                break;
            }
        }
        if(ansb) {
            System.out.println("Lucky Word");
            System.out.println(ans);
        }

        else{
            System.out.println("No Answer");
            System.out.println(0);
        }
    }
}