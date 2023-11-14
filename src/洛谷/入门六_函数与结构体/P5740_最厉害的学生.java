package 洛谷.入门六_函数与结构体;

import java.util.Arrays;
import java.util.Scanner;

public class P5740_最厉害的学生 {
    /*
          定义类，进行对象之间的比较与排序
          重写类中的CompareTo方法
          此方法较为复杂且繁琐，优化代码见最后
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        score[] ss = new score[a];
        for(int i = 0;i<a;i++) {
            String name = sc.next();
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            score s = new score(name,s1,s2,s3);
            ss[i] = s;
        }
        Arrays.sort(ss);
        System.out.println(ss[0].toString());
    }

}
class score implements Comparable<score> {
    private String name;
    private int sum;
    private int s1;
    private int s2;
    private int s3;


    public score(String name, int s1, int s2, int s3) {
        this.name = name;
        this.sum = s1+s2+s3;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }


    @Override
    public int compareTo(score o) {
        return Integer.compare(o.sum, this.sum);
    }

    @Override
    public String toString() {
        return name+" "+s1+" "+s2+" "+s3;
    }
}

//import java.util.*;
//
//
//public class Main {
//      //优化代码，只记录最高的成绩及名字
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        String name = "";
//        int a,b,c,sum = -1;
//        int ans1 = 0,ans2 = 0,ans3 = 0;
//        String ans = "";
//        for (int i = 0; i < n; i++) {
//            name = s.next();
//            a = s.nextInt();
//            b = s.nextInt();
//            c = s.nextInt();;
//            if(sum<(a+b+c)) {
//                sum = a + b + c;
//                ans = name;
//                ans1 = a;ans2 = b;ans3 = c;
//            }
//        }
//        System.out.println(ans+" "+ans1+" "+ ans2+" "+ans3);
//    }
//}