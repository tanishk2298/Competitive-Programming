Problem Link -
https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/maximum-sum-4-f8d12458/description/


import java.util.*;
import java.lang.*;
import java.io.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	long sum = 0, count = 0;
	int max = Integer.MIN_VALUE;
	for(int i=0;i<n;i++){
	    arr[i] = sc.nextInt();
	    if(arr[i] >= 0){
	        sum += arr[i];
	        count++;
	    }
	    else
	    	max = Math.max(max, arr[i]);
	}
	if(count == 0)
	    System.out.println(max+" "+(count+1));
	else
            System.out.println(sum+" "+count);
    }
}
