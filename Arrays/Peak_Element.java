	public int peakElement(int[] a,int n)
    {
        int left=0,right=n-1;
        while(left<right){
             int mid=left+(right-left)/2;
             if(a[mid]<a[mid+1])
                    left=mid+1;
                    else
                    right=mid;
                }
                return left;
    }
