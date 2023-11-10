package 洛谷.函数与结构体;

import java.util.Arrays;
import java.util.Scanner;

public class P5744_培训 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[][] str = new String[n][3];
        for(int i = 0; i<n;i++){
            String s = sc.nextLine();
            str[i] = s.split(" ");
            str[i][1] = String.valueOf(Integer.parseInt(str[i][1])+1);
            str[i][2] = String.valueOf(Math.min(Integer.parseInt(str[i][2]) * 12 / 10, 600));
            String ss = Arrays.toString(str[i]);
            ss = ss.replaceAll(", "," ");
            System.out.println(ss.substring(1,ss.length()-1));
        }
    }
}