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
	         int arr[] = new int[n];
	         int m = sc.nextInt();
	         while (m-- != 0) {
	             int a = sc.nextInt();
	             int b = sc.nextInt();
	             int k = sc.nextInt();
	             for (int i = a; i <= b; i++) {
	                 arr[i] += k;
	             }
	         }
	         int max = -111;
	         for (int i = 0; i < n; i++) {
	             if (arr[i] > max) {
	                 max = arr[i];
	             }
	         }
	         System.out.println(max);
	     }
	 }
}