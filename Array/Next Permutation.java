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
	         int temp = 0;
	         int f = 0;
	         int idx = 0;
	         for (int i = n - 1; i > 0; i--) {
	             if (a[i] > a[i - 1]) {
	                 f = 1;
	                 temp = a[n - 1];
	                 a[n - 1] = a[i - 1];
	                 a[i - 1] = temp;
	                 idx = i - 1;
	                 break;
	             }
	         }
	         if (f == 0) {
	             for (int i = n - 1; i >= 0; i--) {
	                 System.out.print(a[i] + " ");
	             }
	         }
	         else {
	             for (int i = idx + 1; i < n; i++) {
	                 for (int j = i + 1; j < n; j++) {
	                     if (a[j] < a[i]) {
	                         temp = a[j];
	                         a[j] = a[i];
	                         a[i] = temp;
	                     }
	                 }
	             }
    	         for (int i = 0; i < n; i++) {
    	             System.out.print(a[i] + " ");
    	         }
	         }
	         System.out.println();
	         f = 0;
	         temp = 0;
	     }
	 }
}