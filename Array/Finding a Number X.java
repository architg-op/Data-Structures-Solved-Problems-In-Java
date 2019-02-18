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
	         int i, f = 0;
	         for (i = 0; i < n; i++) {
	             a[i] = sc.nextInt();
	         }
	         int x = sc.nextInt();
	         for (i = 0; i < n; i++) {
	             if (a[i] == x) {
	                 f = 1;
	                 break;
	             }
	         }
	         if (f == 0) {
	             System.out.println(-1);
	         }
	         else {
 	             System.out.println(i);
	         }
	         f = 0;
	     }
	 }
}