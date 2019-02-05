/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    int f = 0;
	    while (t-- != 0) {
	        int n = sc.nextInt();
	        int a[] = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextInt();
	        }
	        f = 0;
	        for (int i = 1; i < n; i++) {
	            if (a[i - 1] >= a[i]) {
	          //      System.out.println(a[i - 1] + " > " + a[i]);
	                f = 1;
	                break;
	            }
	        }
	        if (f == 0) {
	            System.out.println(1);
	        }
	        else {
	            System.out.println(0);
	        }
	    }
	}
}