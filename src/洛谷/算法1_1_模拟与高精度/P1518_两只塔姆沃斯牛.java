package 洛谷.算法1_1_模拟与高精度;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 利用状态码来确定是否人和牛都进入循环
 */

public class P1518_两只塔姆沃斯牛 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] map = new String[10];
        int[] farmer = new int[3];
        int[] cow = new int[3];
        int time = 0;
        HashSet<Integer> path = new HashSet<>();
        for(int i = 0;i<10;i++){
            map[i] = sc.nextLine();
            if(map[i].contains("F")){
                farmer[0] = i;
                farmer[1] = map[i].indexOf("F");
            }
            if(map[i].contains("C")){
                cow[0] = i;
                cow[1] = map[i].indexOf("C");
            }
        }
        while(farmer[0] != cow[0] || farmer[1] != cow[1] ){
            time++;
            run(farmer,map);
            run(cow,map);
            int a = farmer[0]*100000+farmer[1]*10000+cow[0]*1000+cow[1]*100+farmer[2]*10+cow[2];
            if(!path.add(a)){
                time = 0;
                break;
            }
        }
        System.out.println(time);
    }
    public static void run(int[] a,String[] map){
        int x = a[0];
        int y = a[1];
        switch(a[2]){
            case 0:
                x--;
                break;
            case 1:
                y++;
                break;
            case 2:
                x++;
                break;
            case 3:
                y--;
                break;
        }
        if(x == -1 ||y== -1|| x == 10 ||y== 10|| map[x].charAt(y) == '*'){
            a[2]++;
            if(a[2]== 4)
                a[2] = 0;
        }
        else{
            a[0] = x;
            a[1] = y;
        }
    }

}
