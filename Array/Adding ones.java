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
	         int k = sc.nextInt();
	         int a[] = new int[n];
	         for (int i = 0; i < n; i++) {
	             a[i] = 0;
	         }
	         while (k != 0) {
	             int j = sc.nextInt();
	             for (int i = 0; i < n; i++) {
	                 if ((i + 1) >= j) {
	                     a[i] += 1;
	                 }
	             }
	             k--;
	         }
	         for (int i = 0; i < n; i++) {
	             System.out.print(a[i] + " ");
	         }
	         System.out.println();
	     }
	 }
}