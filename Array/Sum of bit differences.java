import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     while (t-- != 0) {
	         int n = sc.nextInt();
	         int a[] = new int[n];
	         for (int i = 0; i < n; i++) {
	             a[i] = sc.nextInt();
	         }
	         int sum = 0;
	         int num = 0, rem = 0;
	         for (int i = 0; i < n; i++) {
	             for (int j = i + 1; j < n; j++) {
	                 num = a[i] ^ a[j];
	                 while (num != 0) {
	                     rem = num % 2;
	                     if (rem == 1) {
	                         sum += 2;
	                     }
	                     num /= 2;
	                 }
	             }
	         }
	         System.out.println(sum);
	     }
	 }
}