package 洛谷.入门六_函数与结构体;

import java.util.Scanner;

public class P1217_回文质数_Prime_Palindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pa = 0;
        String sb = String.valueOf(b);
        int bl = sb.length();
        for(int i = 1;i<=bl;i++) {
            switch (i) {
                case 1:
                    //质数一定不是二的倍数，简化掉以2的倍数结尾的数
                    for (int a1 = 1; a1 <= 9; a1 += 2) {
                        pa = a1;
                        if (pa >= a && pa <= b && zhishu(pa))
                            System.out.println(pa);
                    }
                    break;
                case 2:
                    for (int a1 = 1; a1 <= 9; a1 += 2) {
                        pa = a1 * 10 + a1;
                        if (pa >= a && pa <= b && zhishu(pa))
                            System.out.println(pa);
                    }
                    break;
                case 3:
                    for (int a1 = 1; a1 <= 9; a1 += 2) {
                        for (int b1 = 0; b1 <= 9; b1++) {
                            pa = a1 * 100 + b1 * 10 + a1;
                            if (pa >= a && pa <= b && zhishu(pa))
                                System.out.println(pa);
                        }
                    }
                    break;
//                    case 4:
//                        for (int a1 = 1; a1 <= 9; a1 += 2) {
//                            for (int b1 = 0; b1 <= 9; b1++) {
//                                pa = a1 * 1000 + b1 * 100 + b1 * 10 + a1;
//                                if (pa >= a && pa <= b && zhishu(pa))
//                                    System.out.println(pa);
//                            }
//                        }
//                        break;
                //偶数次回文数没有质数，除11外
                case 5:
                    for (int a1 = 1; a1 <= 9; a1 += 2) {
                        for (int b1 = 0; b1 <= 9; b1++) {
                            for (int c1 = 0; c1 <= 9; c1++) {
                                pa = a1 * 10000 + b1 * 1000 + c1 * 100 + b1 * 10 + a1;
                                if (pa >= a && pa <= b && zhishu(pa))
                                    System.out.println(pa);
                            }
                        }
                    }
                    break;
                case 6:
                    for (int a1 = 1; a1 <= 9; a1 += 2) {
                        for (int b1 = 0; b1 <= 9; b1++) {
                            for (int c1 = 0; c1 <= 9; c1++) {
                                pa = a1 * 100000 + b1 * 10000 + c1 * 1000 + c1*100+ b1 * 10 + a1;
                                if (pa >= a && pa <= b && zhishu(pa))
                                    System.out.println(pa);
                            }
                        }
                    }
                    break;
                case 7:
                    for (int a1 = 1; a1 <= 9; a1 += 2) {
                        for (int b1 = 0; b1 <= 9; b1++) {
                            for (int c1 = 0; c1 <= 9; c1++) {
                                for(int d1 = 0;d1<=9;d1++) {
                                    pa = a1 * 1000000 + b1 * 100000 + c1 * 10000+ d1*1000+ c1 * 100 + b1 * 10 + a1;
                                    if (pa >= a && pa <= b && zhishu(pa))
                                        System.out.println(pa);
                                }
                            }
                        }
                    }
                    break;
                case 8:
                    for (int a1 = 1; a1 <= 9; a1 += 2) {
                        for (int b1 = 0; b1 <= 9; b1++) {
                            for (int c1 = 0; c1 <= 9; c1++) {
                                for(int d1 = 0;d1<=9;d1++) {
                                    pa = a1 * 10000000 + b1 * 1000000 + c1 * 100000+ d1*10000 +d1*1000+ c1 * 100 + b1 * 10 + a1;
                                    if (pa >= a && pa <= b && zhishu(pa))
                                        System.out.println(pa);
                                }
                            }
                        }
                    }
                    break;
//                    case 9:
//                        for (int a1 = 1; a1 <= 9; a1 += 2) {
//                            for (int b1 = 0; b1 <= 9; b1++) {
//                                for (int c1 = 0; c1 <= 9; c1++) {
//                                    for(int d1 = 0;d1<=9;d1++) {
//                                        for(int e1 = 0;e1<=9;e1++) {
//                                            pa = a1 * 100000000 + b1 * 10000000 + c1 * 1000000 + d1 * 100000+e1*10000 + d1 * 1000 + c1 * 100 + b1 * 10 + a1;
//                                            if (pa >= a && pa <= b && zhishu(pa))
//                                                System.out.println(pa);
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                        break;
                //一亿并不是回文数，也不是质数
            }
        }
    }
    static boolean zhishu(int a){
        if(a<5)
            return false;
        for(int b = 2;b <= Math.sqrt(a);b++){
            if( a % b == 0)
                return false;
        }
        return true;
    }
}
