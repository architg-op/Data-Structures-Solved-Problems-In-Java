import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static int findFloor(int a[], int x) {
        if (x >= a[a.length - 1]) {
            return a.length - 1;
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == x) {
                return i;
            }
            if (a[i] < x && a[i + 1] >= x) {
                return i + 1;
            }
        }
        return -1;
    }
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
	         System.out.println(findFloor(a, x)); 
	     }
	 }
}