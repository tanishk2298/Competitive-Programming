Problem Link -
https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/simple-search-4/description/


import java.util.*;
import java.lang.*;
import java.io.*;

class TestClass {
	public static void main (String[] args)throws IOException {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    int ans = 0;
	    for(int i=0;i<n;i++)
	        arr[i] = sc.nextInt();
	    int num = sc.nextInt();
	    for(int i=0;i<n;i++)
	        if(arr[i] == num)
	            ans = i;
	    System.out.println(ans);
	}
}
