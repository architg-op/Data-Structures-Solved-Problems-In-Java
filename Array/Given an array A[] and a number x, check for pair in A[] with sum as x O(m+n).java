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
	         int x = sc.nextInt();
	         int a[] = new int[n];
	         for (int i = 0; i < n; i++) {
	             a[i] = sc.nextInt();
	         }
	         Arrays.sort(a);
	         int l = 0;
	         int r = n - 1;
	         int f = 0, sum = 0;
	         while (l < r) {
	             sum = a[l] + a[r];
	             if (sum == x) {
	                 f = 1;
	                 break;
	             }
	             else if (sum < x) {
	                 l++;
	             }
	             else {
	                 r--;
	             }
	         }
	         if (f == 1){
	             System.out.println("Yes");
	         }
	         else {
	             System.out.println("No");
	         }
	         
	     }
	     
	 }
}