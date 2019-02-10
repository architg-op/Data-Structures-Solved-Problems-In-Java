import java.util.*;
import java.lang.*;
class Height
{
    int feet;
    int inches;
    
      public Height(int ft, int inc)
      {
           feet = ft;
           inches = inc;
      }
}
class maximum
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Height arr[] = new Height[n];
            for(int i = 0; i < n; i++)
            {
                int temp1 = sc.nextInt();
                int temp2 = sc.nextInt();
                arr[i] = new Height(temp1, temp2);
              
            }
            GfG gfg = new GfG();
            
            int res = gfg.findMax(arr, n);
            System.out.println(res);
        }
    }
}

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
Class of the element of the array is as
class Height {
	int feet;
	int inches;
	public Height(int ft, int inc)
	{
	    feet = ft;
	    inches = inc;
	}
}
*/
// function must return the maximum Height
// return the height in inches
class GfG
{
    public static int findMax(Height arr[], int n)
    {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = arr[i].feet * 12 + arr[i].inches;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}