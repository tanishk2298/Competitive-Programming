class GfG {
    int transitionPoint(int a[], int n) {
        int i = 0;
        for(i=0;i<n;i++){
            if(a[i]==1)
                break;
        }
        if(i==n)
            return -1;
        return i;
    }
}
