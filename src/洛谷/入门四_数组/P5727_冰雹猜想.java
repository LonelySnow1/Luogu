package 洛谷.入门四_数组;

import java.util.ArrayList;
import java.util.Scanner;

public class P5727_冰雹猜想 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        ArrayList list  = new ArrayList();
        int n = sc.nextInt();
        while(n != 1) {
            if(n %2 == 0) {
                list.add(n);
                n/=2;
            }
            else {
                list.add(n);
                n = n *3 + 1;
            }
        }
        list.add(1);
        for(int i = list.size();i>0;i--) {
            System.out.printf("%d ",list.get(i - 1));
        }
    }
}