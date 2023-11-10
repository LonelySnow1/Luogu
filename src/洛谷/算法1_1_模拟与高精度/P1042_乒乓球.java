package 洛谷.算法1_1_模拟与高精度;

import java.util.Scanner;

public class P1042_乒乓球 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a1 = 0;
        int b1 = 0;
        int a2 = 0;
        int b2 = 0;
        int index1 = 0;
        int index2 = 0;
        boolean start = true;
        String[] ans1 = new String[5685];
        String[] ans2 = new String[2978];
        while(start){
            String str = sc.nextLine();
            for(int i = 0; i< str.length();i++){
                switch (str.charAt(i)){
                    case 'W':
                        a1++;
                        a2++;
                        break;
                    case 'L':
                        b1++;
                        b2++;
                        break;
                    case 'E':
                        start = false;
                        break;
                }
                if(((a1 >= 11 || b1>=11) && Math.abs(a1-b1)>=2) || !start){
                    ans1[index1] = a1+":"+b1;
                    a1 = b1 = 0;
                    index1++;
                }
                if(((a2 >= 21 || b2 >= 21) && Math.abs(a2-b2)>=2) || !start){
                    ans2[index2] = a2+":"+b2;
                    a2 = b2 = 0;
                    index2++;
                }
                if(!start)
                    break;
            }
        }
        for(int i = 0; i< ans1.length;i++){
            if(ans1[i] != null)
                System.out.println(ans1[i]);
            else break;
        }
        System.out.println();
        for(int i = 0; i< ans2.length;i++){
            if(ans2[i] != null)
                System.out.println(ans2[i]);
            else break;
        }
    }
}