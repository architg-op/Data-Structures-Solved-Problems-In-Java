import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     while (t-- != 0) {
	        int n = sc.nextInt();
	        int d = sc.nextInt();
	        int a[] = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextInt();
	        }
	         int j, k, temp;
	         for (int i = 0; i < gcd(n, d); i++) {
	             temp = a[i];
	             j = i;
	             while (true) {
	                 k = j + d;
	                 if (k >= n) {
	                     k = k % n;
	                 } 
	                 if (k == i) {
	                     break;
	                 }
	                 a[j] = a[k];
	                 j = k;
	             }
	             a[j] = temp;
	         }
	         for (int i = 0; i < n; i++) {
	             System.out.print(a[i] + " ");
	         }
	         System.out.println();
	     }
	 }
}