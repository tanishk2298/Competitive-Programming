//Problem Link https://www.codechef.com/JAN21B/problems/FAIRELCT

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
            int m = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[m];
            long aSum,bSum;
            aSum = bSum = 0;
            int count = 0;
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
                aSum += a[i];
            }
            for(int i=0;i<m;i++){
                b[i] = sc.nextLong();
                bSum += b[i];
            }
            if(aSum > bSum)
                System.out.println(count);
            else{
                Arrays.sort(a);
                Arrays.sort(b);
                boolean flag = false;
                int i = 0;
                int j = (m-1);
                while(i<n && j>=0){
                    aSum -= a[i];
                    aSum += b[j];
                    bSum -= b[j];
                    bSum += a[i];
                    count++;
                    i++;
                    j--;
                    if(aSum > bSum){
                        flag = true;
                        break;
                    }
                }
                if(flag)
                    System.out.println(count);
                else
                    System.out.println(-1);
            }
        }
	}
}
