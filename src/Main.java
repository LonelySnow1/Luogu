import java.math.BigInteger;
import java.util.Scanner;


public class Main{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int exp = sc.nextInt();
        System.out.println((int)(exp*Math.log10(2)+1));
        BigInteger rad = power(BigInteger.valueOf(2),exp).subtract(BigInteger.ONE);
        String zero = "00000000000000000000000000000000000000000000000000";
        String ans =String.valueOf(rad);
        if(ans.length()<500){
            int k = 500-ans.length();
            int b = 0;
            while(k>=50){
                System.out.println(zero);
                k-=50;
            }
            System.out.print(zero.substring(0,k));
            System.out.println(ans.substring(0,50-k));
            while(50-k+b < ans.length() ){
                System.out.println(ans.substring(50-k+b,100-k+b));
                b+=50;
            }
        }
        else{
            ans = ans.substring(ans.length()-500);
            for(int i = 0;i<10;i++){
                for(int l = 0;l<50;l++){
                    System.out.print(ans.charAt(l+i*50));
                }
                System.out.println();
            }
        }
    }
    public static BigInteger power(BigInteger rad,int exp){
        BigInteger mod = BigInteger.TEN.pow(500);
        BigInteger a = BigInteger.valueOf(1);
        while(exp>1){
            if(exp%2==0){
                rad = rad.multiply(rad);
                exp = exp/2;
            }
            else{
                a = a.multiply(rad).mod(mod);
                rad = rad.multiply(rad);
                exp = (exp-1)/2;
            }
        }
        rad = rad.multiply(a).mod(mod);
        return rad;
    }
}