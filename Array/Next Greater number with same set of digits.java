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
	         int i = 0; 
	         int f = 0;
	         int r = a.length - 1;
	         // Finding the Number which breakes the ascending order pattern from right
    	     for (int j = a.length - 1; j > 0; j--) {
	             if (a[j - 1] < a[j]) {
	                 f = 1;
	                 i = j - 1;
	                 break;
	             }
	         }
	         if (f == 1) {
	             // Finding the Smallest number which is greater than a[i]
	             int min = 1111;
	             for (int q = i + 1; q < n; q++) {
	                 if (a[q] > a[i] && a[q] < min) {
	                     min = a[q];
	                     r = q;
	                 }
	             }
	             // Swapping numbers
    	         int temp = a[i];
    	         a[i] = a[r];
    	         a[r] = temp;
    	         // Sorting numbers
    	         Arrays.sort(a, i + 1, n);
    	         // Printing the numbers
    	         for (int j = 0; j < a.length; j++) {
    	             System.out.print(a[j] + " ");
    	         }
    	         System.out.println();
	         }
	         else {
	         	// Printing in reverse order if the numbers are found in descending order
	             for (i = a.length - 1; i >= 0; i--) {
	                 System.out.print(a[i] + " ");
	             }
	         }
	         f = 0;
	     }
	 }
}