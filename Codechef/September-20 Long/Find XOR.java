
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-->0){
		    long n = sc.nextLong();
		    ArrayList<Long> arr = new ArrayList<>();
		    long temp=0,ans=0;
		    for(int i=0;i<20;i++){
		        temp = 1<<(i+1);
		        System.out.println("1 "+temp);
		        arr.add(sc.nextLong());
		    }
		    Collections.reverse(arr);
		    temp = Math.abs(n*(1<<20) - arr.get(0));
		    if(temp%2 != 0)
		        ans += 1;
		    for(int i=1;i<arr.size();i++){
		        long curr = arr.get(i);
		        long temp1 = Math.abs(temp - curr);
		        long temp2 = 1 << (20 - i);
		        if(temp > curr){
		            long x = (n+(temp1)/(temp2));
		            arr.set(i,x/2);
		        }
		        else{
		            long y = (n-(temp1)/(temp2));
		            arr.set(i,y/2);
		        }
		        if((arr.get(i)%2) != 0)
		            ans += temp2;
		    }
		    System.out.println("2 "+ans);
		    int finalAns = sc.nextInt();
		}
	}
}
