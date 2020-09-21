import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main(String[] args)throws IOException{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0){
		    boolean flag = false;
		    int count = 0;
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int l = sc.nextInt();
		    ArrayList<Integer> arr = new ArrayList<>();
		    if(n<=(l*k)){
		        while(count < n){
    		            for(int i=1;i<=k;i++){
    		                arr.add(i);
    		                count++;
    		                if(count == n)
    		                    break;
    		            }
		        }
    		        for(int i=0;i<(arr.size()-1);i++){
    		            if(arr.get(i) == arr.get(i+1)){
    		                flag = true;
    		                break;
    		            }
    		        }
    	                if(flag == false)
    	                    for(int i : arr)
    	                        System.out.print(i+" ");
    	                else
    	                    System.out.print("-1");
		    }
		    else
		        System.out.print("-1");
		    System.out.println("");
		}
	}
}