package 洛谷.入门一_顺序结构;/*
 24小时制下，计算时间需要考虑是否小于零，若小于，加上24，大于等于时不用改变
 此题还可以使用日期计算函数，之后可以研究一下
 */
import java.util.Scanner;
public class P5707_上学迟到 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s,v,t;
        int m,h;
        int hh,mm;
        s = sc.nextInt();
        v = sc.nextInt();
        t = Math.ceil(s/v) + 10;
        m = (int)t%60;
        h = (int)t/60;
        hh = (m==0)?8 - h:8-h-1;
        mm = (m==0)?0:60 - m;
        hh = (hh < 0)?24+hh:hh;
        System.out.printf("%02d:%02d",hh,mm);
    }
}

/*
利用日期计算函数
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int y = scanner.nextInt();
        Calendar date = Calendar.getInstance();
        date.set(2021, Calendar.MAY, 5, 8, 0, 0);
        date.add(Calendar.MINUTE, -10);
        date.add(Calendar.MINUTE, s % y == 0 ? -(s / y) : -(s / y) - 1);
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        System.out.println(format.format(date.getTime()));
    }
}
 */