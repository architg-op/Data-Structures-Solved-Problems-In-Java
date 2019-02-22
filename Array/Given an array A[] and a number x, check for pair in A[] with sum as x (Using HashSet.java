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
	         int f = 0;
	         Set<Integer> s = new HashSet<>();
	         for (int i = 0; i < a.length; i++) {
	             if (s.contains(x - a[i])) {
	                 f = 1;
	                 break;
	             }
	             s.add(a[i]);
	         }
	         if (f == 1) {
	             System.out.println("Yes");
	         }
	         else {
	             System.out.println("No");
	         }
	     }
	     
	 }
}