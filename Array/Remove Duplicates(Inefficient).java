int remove_duplicate(int a[])
	{
	    int newa[] = new int[1000];
	    for (int i = 0; i < 1000; i++) {
	        newa[i] = 0;
	    }
	    for (int i = 0; i < a.length; i++) {
	        newa[a[i]]++;
	    }
	    int cnt = 0;
	    int k = 0;
	    for (int i = 0; i < 1000; i++) {
	        if (newa[i] >= 1) {
	            a[k++] = i;
	        }
	    }
	    return k;
	}