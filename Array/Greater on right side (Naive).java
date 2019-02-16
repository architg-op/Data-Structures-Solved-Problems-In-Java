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
	         for (int i = 0; i < n; i++) {
	             int max = -1;
	             for (int j = i + 1; j < n; j++) {
	                 if (a[j] > max) {
	                     max = a[j];
	                 }
	             }
	             a[i] = max;
	         }
	         a[n - 1] = -1;
	         for (int i = 0; i < n; i++) {
	             System.out.print(a[i] + " ");
	         }
	         System.out.println();
	     }
	 }
}