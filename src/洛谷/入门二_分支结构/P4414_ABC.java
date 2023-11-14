package 洛谷.入门二_分支结构;

import java.util.Scanner;

public class P4414_ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a1, b1, c1;
        String d = sc.next();
        a1 = Math.max(a, Math.max(b, c));
        b1 = Math.min(a, Math.min(b, c));
        c1 = a + b + c - a1 - b1;
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            switch (d.charAt(i)) {
                case 65:
                    arr[i] = b1;
                    break;
                case 66:
                    arr[i] = c1;
                    break;
                case 67:
                    arr[i] = a1;
                    break;
            }
            System.out.printf("%d ",arr[i]);
        }

    }
}