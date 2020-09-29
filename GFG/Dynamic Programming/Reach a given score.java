import java.util.;
import java.lang.;
import java.io.;
class GFG
 {
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc--0){
	        int sum = sc.nextInt();
	        int n = 3;
	        int[] arr = {3,5,10};
	        int[][]dp = new int[n+1][sum+1];
	        for(int i=0;i=sum;i++)
	            dp[0][i] = 0;
	        for(int j=0;j=n;j++)
	            dp[j][0] = 1;
	        for(int i=1;i=n;i++){
	            for(int j=1;j=sum;j++){
	                if(arr[i-1] = j)
	                    dp[i][j] = dp[i][j-arr[i-1]] + dp[i-1][j];
	                else
	                    dp[i][j] = dp[i-1][j];
	            }
	        }
	        System.out.println(dp[n][sum]);
	    }
	}
}