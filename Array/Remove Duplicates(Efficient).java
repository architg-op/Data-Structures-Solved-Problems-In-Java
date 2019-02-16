int remove_duplicate(int a[])
	{
	    int j = 0;
	    for (int i = 0; i < a.length - 1; i++) {
	        if (a[i] != a[i + 1]) {
	            a[j++] = a[i];
	        }
	    }
	    a[j++] = a[a.length - 1];
	    return j;
	}