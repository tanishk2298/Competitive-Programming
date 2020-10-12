import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    boolean[] isInfected = new boolean[n];
		    Arrays.fill(isInfected, false);
		    int currCity = 0;
		    for(int i=0;i<n;i++){
		        currCity = (x+k)%n;
		        isInfected[currCity] = true;
		        x = currCity;
		    }
		    if(isInfected[y])
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}