
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine().trim());
		while(cases-->0){
			String ip[] = br.readLine().trim().split(" ");
			int n = Integer.parseInt(ip[0]);
			int k = Integer.parseInt(ip[1]);
			int[] arr = new int[n];
			String inp[] = br.readLine().trim().split(" ");
			for(int i=0;i<n;i++)
				arr[i]=Integer.parseInt(inp[i]);
			int ans = Integer.MAX_VALUE, x = 0;
			for(int i=0;i<n;i++){
			    if(arr[i]<=k && (k%arr[i]) == 0 && ((k/arr[i])-1) < ans ){
			        ans = (k/arr[i])-1;
			        x = i;
			    }
			}
			if(ans == Integer.MAX_VALUE)
				System.out.println(-1);
			else
				System.out.println(arr[x]);
		}
	}
}