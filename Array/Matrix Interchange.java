void interchange(int r,int c)
{
    //Your code here
    int temp = 0;
    for(int i=0;i<r;i++) {
        temp = arr[i][0];
        arr[i][0] = arr[i][c - 1];
        arr[i][c - 1] = temp;
    }
}