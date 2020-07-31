class Peak
{
	public int peakElement(int[] a,int n){
        	int low = 0,high=n-1,mid=0;
       		while(low<=high){
           		mid = (low+high)/2;
           		if((mid==0||a[mid]>=a[mid-1])&&(mid==n-1||a[mid]>=a[mid+1]))
                		return mid;
            		else if(mid>0&&(a[mid-1]>=a[mid]))
                		high = mid-1;
            		else
                		low = mid+1;
       		}
       		return -1;
    	}
}