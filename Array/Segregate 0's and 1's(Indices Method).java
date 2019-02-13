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
	         int low, mid, high = n - 1;
	         low = mid = 0;
	         while (mid <= high) {
	             if (a[mid] == 0) {
	                 int temp = a[low];
	                 a[low] = a[mid];
	                 a[mid] = temp;
	                 low++;
	                 mid++;
	             }
	             else {
	                 int temp = a[mid];
	                 a[mid] = a[high];
	                 a[high] = temp;
	                 high--;
	             }
	         }
	         for (int i = 0; i < n; i++) {
	             System.out.print(a[i] + " ");
	         }
	         System.out.println();
	     }
	 }
}