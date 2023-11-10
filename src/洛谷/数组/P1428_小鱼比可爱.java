package 洛谷.数组;

import java.util.Scanner;
//思路：每次添加都遍历一遍，查找小的个数——o(i)
//如果从后往前比——最好情况只需要比一次，然后直接在上次结果加一即可，最坏情况需要全部遍历一次，即o(i)
public class P1428_小鱼比可爱 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] ans = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
			int b = 0;
			for(int a = 0;a<i;a++) {
				if(arr[i]>arr[a])
					b++;
			}
			ans[i] = b;
		}
	}
}