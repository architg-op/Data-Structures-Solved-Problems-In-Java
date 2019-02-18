import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static int findBitonic(int a[], int l, int r) {
        if (l == r) {
            return l;
        }
        if (r == l + 1 && a[l] >= a[r]) {
            return l;
        }
        if (r == l + 1 && a[r] > a[l]) {
            return r;
        }
        int mid = l + (r - l) / 2;
        
        if (a[mid] > a[mid + 1] && a[mid] > a[mid - 1]) {
            return mid;
        }
        else if (a[mid] > a[mid - 1] && a[mid] < a[mid + 1]) {
          return findBitonic(a, mid + 1, r); 
        }
        else  {
          return findBitonic(a, l, mid - 1);
        }
    }
    static int ascBin(int a[], int x, int l, int r) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] == x) {
                return mid;
            }
            else if (x < a[mid]) {
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return -1;
        
    }
    static int descBin(int a[], int x, int l, int r) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] == x) {
                return mid;
            }
            else if (x < a[mid]) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return -1;
    }
    static int searchNumber(int a[], int x, int bitP) {
        if (x > a[bitP]) {
            return -1;
        }
        if (x == a[bitP]) {
            return bitP;
        }
        else {
            int temp = ascBin(a, x, 0, bitP - 1);
            if (temp != -1) {
                return temp;
            }
            return descBin(a, x, bitP + 1, a.length - 1);
        }
    }
	public static void main (String[] args)
	 {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     while (t-- != 0) {
	         int n = sc.nextInt();
	         int a[] = new int[n];
	         int i, f = 0;
	         for (i = 0; i < n; i++) {
	             a[i] = sc.nextInt();
	         }
	         int x = sc.nextInt();
	         int bitP = findBitonic(a, 0, n - 1);
	         int ans = searchNumber(a, x, bitP);
             System.out.println(ans);
	         
	     }
	 }
}