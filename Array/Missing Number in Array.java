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
	         int a[] = new int[n - 1];
	         int sum = 0;
	         for (int i = 0; i < n - 1; i++) {
	             a[i] = sc.nextInt();
	             sum += a[i];
	         }
	         int hyp = (n * (n + 1)) / 2;
	         System.out.println(hyp - sum);
	     }
	 }
}