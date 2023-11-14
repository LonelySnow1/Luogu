package 洛谷.入门四_数组;

import java.util.ArrayList;
import java.util.Scanner;

public class P1427_小鱼的数字游戏 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        ArrayList list  = new ArrayList();
        while(true){
            int a = sc.nextInt();
            if(a == 0)
                break;
            else
                list.add(a);
        }
        for(int i = 0;i<list.size() ;i++) {
            System.out.printf("%d ",list.get(list.size() - i -1));
        }
    }
}