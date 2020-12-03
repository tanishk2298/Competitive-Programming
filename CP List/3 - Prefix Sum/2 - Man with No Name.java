Problem Link -
https://www.codechef.com/problems/BLONDIE


import java.util.*;

class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-->0){
                int n = sc.nextInt();
                long[] arr = new long[n];
                for(int i=0;i<n;i++)
                    arr[i] = sc.nextLong();
                long vis = 0;
                long sum = 0;
                for(int i=0;i<n;i++){
                    if(arr[i] == -1)
                        arr[i] = sum / vis;  
                    sum += arr[i];        
                    vis++;
                    System.out.print(arr[i]+" ");
                }
                System.out.println(" ");
            }
	}
}	

