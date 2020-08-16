class Josephus
{
   public int ans = 0;
   public int josephus(int n, int k)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++)
            arr.add(i+1);
        solve(arr,0,k-1);
        return ans;
    }
    public void solve(ArrayList<Integer> arr, int index, int k){
        if(arr.size() == 1){
            ans = (arr.get(0));
            return;
        }
        int i =(index + k) % arr.size();
        arr.remove(i);
        solve(arr, i, k);
    }
}