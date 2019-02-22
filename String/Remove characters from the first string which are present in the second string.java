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
	         String s1 = sc.next();
	         String s2 = sc.next();
	         char ch3[] = new char[s1.length()];
	         int count[] = new int[257];
	         int k = 0;
	         for (int i = 0; i < 257; i++) {
	             count[i] = 0;
	         }
	         for (int i = 0; i < s2.length(); i++) {
	             count[s2.charAt(i)]++;
	         }
	         for (int i = 0; i < s1.length(); i++) {
	             if (count[s1.charAt(i)] == 0) {
	                 ch3[k++] = s1.charAt(i);
	             }
	         }
	         for (int i = 0; i < k; i++) {
	             System.out.print(ch3[i]);
	         }
	         System.out.println();
	     }
	 }
}