/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int l[] = {1, 2, 4, 6};
	    int r[] = {3, 5, 7, 8};
	    int nL = l.length;
	    int nR = r.length;
	    int a[] = new int[nL + nR];
	    int i = 0, j = 0, k = 0;
	    while (i < nL && j < nR) {
	        if (l[i] <= r[j]) {
	            a[k] = l[i];
	            i++;
	        }
	        else {
	            a[k] = r[j]; 
	            j++;
	        }
	        k++;
	    }
	    while (i < nL) {
	        a[k++] = l[i++];
	    }
	    while (j < nR) {
	        a[k++] = r[j++];
	    }
	    for (int m = 0; m < k; m++) {
	        System.out.print(a[m] + " ");
	    }
	}
}
