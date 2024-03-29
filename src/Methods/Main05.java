package Methods;
/**
 * 
 * 一个正整数的阶乘（英语：factorial）是所有小于及等于该数的正整数的积，并且有0的阶乘为1。自然数n的阶乘写作n!。
 * 亦即n!=1×2×3×...×n。阶乘亦可以递归方式定义：0!=1，n!=(n-1)!×n。
 *
 */
import java.util.*;

public class Main05 {
	public static long factorial(int num) {
		if(num ==0) {
			return 0;
		}
		if(num ==1) {
			return 1;
		}else
		return num*factorial(num-1);
	}
	public static void main(String[] args) {
		System.out.println("输入位数");
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		System.out.println(factorial(N));
		for (int counter = 0; counter <= N; counter++){
	        System.out.printf("%d! = %d\n", counter,
	        factorial(counter));
	    }
	}
}
