import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine().trim());
		while(cases-->0){
			String nm[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(nm[0]);
			int m = Integer.parseInt(nm[1]);
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
				arr[i]=Integer.parseInt(br.readLine().trim());
			Arrays.sort(arr);
			long max = arr[n-1], min = arr[0];
			System.out.println(aggrCows(arr,n,m,min,max));
		}
	}
	public static long aggrCows(int[] arr, int n, int m, long min, long max){
		long low = min, high = max, mid = 0, ans = 0;
		if(n<m)
	        	return ans;
		while(low<=high){
			mid = low + (high - low) / 2;
			if(isValid(arr,n,m,mid)){
			    	ans = mid;
				low = mid + 1;
			}
			else
				high = mid - 1;
		}
		return ans;
	}
	public static boolean isValid(int[] arr, int n, int m, long gap){
		long cow = 1;
		int start =0;
		for(int i=1;i<n;i++){
			if((arr[i] - arr[start]) >= gap){
				cow++;
				start = i;
			}
			if(cow>=m)
			    return true;
		}
		return false;
	}
}