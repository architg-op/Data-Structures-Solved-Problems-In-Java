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
	         for (int i = 0; i < n; i++) {
	             for (int j = i + 1; j < n; j++) {
	                 if (i * a[i] > j * a[j]) {
	                     cnt++;
	                 }
	             }
	         }
	         System.out.println(cnt);
	         cnt = 0;
	     }
	 }
}