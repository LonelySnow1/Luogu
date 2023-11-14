package 洛谷.入门四_数组;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
//此题注意得到的数不能跟减去的数相同，即不能存在100 = 50 + 50的情况
public class P2141_珠心算测验 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int ans = 0;
                ArrayList arr = new ArrayList();
                for(int i = 0;i<n;i++)
                    arr.add(sc.nextInt());
                arr.sort(Comparator.naturalOrder());
                for(int i = n-1 ;i>1;i--){
                    for(int c = 0;c<i;c++){
                        if(arr.contains(((int)arr.get(i)-(int)arr.get(c))) && arr.indexOf(((int)arr.get(i)-(int)arr.get(c)))!=c){
                            ans++;
                            break;
                        }
                    }
                }
            System.out.println(ans);
        }
}