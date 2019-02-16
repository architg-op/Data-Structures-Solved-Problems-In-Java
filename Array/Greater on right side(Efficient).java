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
	         int max = a[n - 1];
	         for (int i = n - 2; i >= 0; i--) {
	             int temp = a[i];
	             a[i] = max;
	             if (temp > max) {
	                 max = temp;
	             }
 	         }

            // Printing the Array
	         a[n - 1] = -1;
	         for (int i = 0; i < n; i++) {
	             System.out.print(a[i] + " ");
	         }
	         System.out.println();
	     }
	 }
}