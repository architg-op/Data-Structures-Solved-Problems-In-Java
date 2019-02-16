import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static int merge(int a[], int l, int m, int r) {
        int invCnt = 0;
        int L[] = new int[m - l + 1];
        int R[] = new int[r - m];
        for (int i = 0; i < L.length; i++) {
            L[i] = a[l + i];
        }
        for (int j = 0; j < R.length; j++) {
            R[j] = a[m + j + 1];
        }
        int i, j, k;
        i = j = 0;
        k = l;
        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                a[k++] = L[i++];
            }
            else {
                invCnt += (m + 1 - i);
                a[k++] = R[j++];
            }
        }
        while (i < L.length) {
            a[k++] = L[i++];
        }
        while (j < R.length) {
            a[k++] = R[j++];
        }
        return invCnt;
    }
    static int mergeSort(int a[], int l, int r) {
        int invCnt = 0;
        if (l < r) {
            int m = (l + r) / 2;
            invCnt = mergeSort(a, l, m);
            invCnt += mergeSort(a, m + 1, r);
            invCnt += merge(a, l, m, r);
        }
        return invCnt;
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
	        System.out.println(mergeSort(a, 0 , n - 1));
	        for (int i = 0; i < a.length; i++) {
	            System.out.println(a[i]);
	        }
	     }
	 }
}