package whatever do not write package name here 

import java.util.;
import java.lang.;
import java.io.;

class GFG {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine().trim());
		while(cases--0){
			int n = Integer.parseInt(br.readLine().trim());
			int[] arr = new int[n];
			String ip[] = br.readLine().trim().split( );
			for(int i=0;in;i++)
				arr[i]=Integer.parseInt(ip[i]);
			int max = arr[0];
			int count = 1;
			for(int i=1;in;i++)
			    if(arr[i]max){
			        count++;
			        max = arr[i];
			    }
			System.out.println(count);
		}
	}
}