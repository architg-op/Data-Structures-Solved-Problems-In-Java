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
	         int cnt = 0;
	         // Counting 0's
	         for (int i = 0; i < n; i++) {
	             if (a[i] == 0) {
	                 cnt++;
	             }
	         }
	         // Filling 0's 
	         for (int i = 0; i < cnt; i++) {
	             a[i] = 0;
	         }
	         // Filling 1's
	         for (int i = cnt; i < n; i++) {
	             a[i] = 1;
	         }
	         // Printing the Binary Array
	         for (int i = 0; i < n; i++) {
	             System.out.print(a[i] + " ");
	         }
	         System.out.println();
	     }
	 }
}