package 洛谷.入门四_数组;

import java.util.Scanner;

//本题坑点就在于不好找对应关系，找对了就容易许多 画图找规律建议使用 字母+数字 如a1 a2 a3 这样的，纯字母/纯数字极易找错关系
public class P1205_方块转换_Transformations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0 ,x1 = 0,ans = 7;
        boolean b1 = true;
        char[][] a = new char[n][n];
        char[][] a1 = new char[n][n];
        for(int i = 0;i<n;i++){
            String b = sc.next();
            for(int k = 0;k<n;k++) {
                a[i][k] = b.charAt(k);
                if(a[i][k] == '@')
                    x++;
            }
        }
        for(int i = 0;i<n;i++){
            String b = sc.next();
            for(int k = 0;k<n;k++) {
                a1[i][k] = b.charAt(k);
                if(a[i][k] != a1[i][k])
                    b1 = false;
                if(a1[i][k] == '@')
                    x1++;
            }
        }
        if(x != x1)
            System.out.println(7);
        else{
            ans = f1(a,a1) == 0?f2(a,a1):f1(a,a1);
            if(ans == 0 && !b1)
                System.out.println(7);
            else
                System.out.println(ans == 0?6:ans);
        }
    }
    private static int f1(char[][] a, char[][] b){
        int n = a[0].length;
        boolean b1 = true,b2 = true,b3 = true;
        char[][] c1 = new char[n][n];
        char[][] c2 = new char[n][n];
        char[][] c3 = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int k = 0;k<n;k++){
                if(b1)
                    c1[i][k] = a[n-k-1][i];
                if(b2)
                    c2[i][k] = a[n-i-1][n-k-1];
                if(b3)
                    c3[i][k] = a[k][n-i-1];
                if(c1[i][k] != b[i][k])
                    b1 = false;
                if(c2[i][k] != b[i][k])
                    b2 = false;
                if(c3[i][k] != b[i][k])
                    b3 = false;
                if(!b1 && !b2 && !b3)
                    break;
            }
        }
        if(b1)
            return 1;
        else if(b2)
            return 2;
        else if(b3)
            return 3;
        else
            return 0;
    }
    private static int f2(char[][] a, char[][] b){
        int n = a[0].length;
        boolean d = true;
        char[][] c = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int k = 0;k<n;k++){
                c[i][k] = a[i][n-k-1];
                if(c[i][k] != b[i][k])
                    d = false;
            }
        }
        if(d)
            return 4;
        else{
            if(f1(c,b) == 0)
                return 0;
            else
                return 5;
        }
    }
}