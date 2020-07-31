class Missing{
    
    // function to find first positive missing number
    static int missingNumber(int arr[], int size){
        boolean one = false;
        for(int i : arr)
            if(i == 1)
                one = true;
        if(!one)
            return 1;
        for(int i=0;i<size;i++)
            if(arr[i]<=0 || arr[i]>size)
                arr[i] = 1;
        for(int i=0;i<size;i++){
            int curr = Math.abs(arr[i]);
            if(curr == size)
                arr[0] = -1 * Math.abs(arr[0]);
            else
                arr[curr] = -1 * Math.abs(arr[curr]);
        }
        for(int i=1;i<size;i++)
            if(arr[i]>0)
                return i;
        if(arr[0] > 0)
            return size;
        return size + 1;
    }
}