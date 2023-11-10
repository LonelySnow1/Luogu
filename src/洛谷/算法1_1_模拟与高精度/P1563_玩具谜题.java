package 洛谷.算法1_1_模拟与高精度;

import java.util.Scanner;

public class P1563_玩具谜题 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int p = sc.nextInt();//人数 person
        int a = sc.nextInt();//操作数 action
        int step = 0;//向左步数
        String[][] name = new String[p][2];
        for(int i = 0;i< p;i++){
            name[i][0] = sc.next();
            name[i][1] = sc.nextLine();
        }
        for(int i  = 0; i < a ;i++ ){
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(name[step][0].equals("0"))
                c = -c;
            if(b==1)
                c = -c;
            step += c;
            while(step<0)
                step+=p;
            while(step>=p)
                step-=p;
        }
        System.out.println(name[step][1].trim());
    }
}