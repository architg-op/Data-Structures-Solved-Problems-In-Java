import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception
	 {
	     Scanner sc = new Scanner(System.in);
	     int f = 0;
	     int t = sc.nextInt();
	     while (t-- != 0) {
	        int p = sc.nextInt();
	        String s = sc.nextLine(); 
            String[] ss = s.split(" ");
            int n = ss.length;
            int a[] = new int[n];
            for(int i=0;i<n;i++) {
                a[i]= Integer.valueOf(ss[i]);
            }
	         
	         for (int i = 0; i < n; i++) {
	             int j = i - 1;
	             int lsum, rsum;
	             lsum = rsum = 0;
	             while (j >= 0) {
	                 lsum += a[j];
	                 j--;
	             }
	             j = i + 1;
	             while (j < n) {
	                 rsum += a[j];
	                 j++;
	             }
	             if (lsum == rsum) {
	                 f = 1;
	                 break;
	             }
	         }
	         if (f == 1) {
	             System.out.println("YES");
	         }
	         else {
	             System.out.println("NO");
	         }
	         f = 0;
	     }
	 }
}