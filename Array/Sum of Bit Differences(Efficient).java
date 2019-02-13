import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static int bitDifferences(int a[], int n) {
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < n; j++) {
                if ((a[j] & 1<<i) != 0) {
                    cnt++;
                }
            }
            sum += cnt * (n - cnt) * 2;
            cnt = 0;
        }
        return sum;
    }
    
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
	         System.out.println(bitDifferences(a, n));
	     }
	 }
}