package 洛谷.入门五_字符串;

import java.util.Scanner;

public class P3741_honoka的键盘 {
    //此题还可以先行替换，如将VK替换为X，再去计X次数
    //由于此题不需要用到 index 所以用一个代替两个也是可以的
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        String str = sc.next();
        int ad = str.indexOf("VK");
        while(ad != -1){
            ans++;
            ad = str.indexOf("VK",ad+2);
        }
        str = str.replaceAll("VK","00");
        if(str.contains("VV") || str.contains("KK"))
            ans++;
        System.out.println(ans);
    }
}