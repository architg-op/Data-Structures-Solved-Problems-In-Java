import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     int f = 0;
	     while (t-- != 0) {
	         int n = sc.nextInt();
	         int x = sc.nextInt();
	         int a[] = new int[n];
	         for (int i = 0; i < n; i++) {
	             a[i] = sc.nextInt();
	         }
	         int cnt = 0;
	         for (int i = 0; i < n; i++) {
	             if (a[i] == x) {
	                 f = 1;
	                 cnt++;
	             }
	         }
	         if (f == 1) {
	             System.out.println(cnt);
	         }
	         else {
	             System.out.println(-1);
	         }
	         f = 0;
	     }
	 }
}