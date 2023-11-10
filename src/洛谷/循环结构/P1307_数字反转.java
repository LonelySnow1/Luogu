package 洛谷.循环结构;

import java.util.Scanner;
//此题坑点 ： 需考虑0的情况

public class P1307_数字反转 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            char[] arr = new char[str.length()];
            boolean is = false;
            boolean a = false;
            if(str.length() == 1)
                System.out.println(str.charAt(0));
            else if(str.charAt(0) == '-')
                arr = new char[str.length() - 1 ];
            for(int i = 0 ; i<arr.length;i++){
                if (str.charAt(0) == '-'){
                    is = true;
                    arr[i] = str.charAt(i+1);
                }
                else{
                    arr[i] = str.charAt(i);
                }
            }
            if(is)
                System.out.printf("-");
            for(int i = 0;i<arr.length;i++) {
                if(arr[arr.length - i -1] != '0' || a){
                    System.out.printf("%c",arr[arr.length - i - 1]);
                    a = true;
                }
            }
        }
}
