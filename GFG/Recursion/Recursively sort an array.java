import java.util.*;
import java.lang.*;
import java.io.*;

public class recursivesort {
    public static void main (String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			arr.add(sc.nextInt());
		sort(arr);
		for(int i: arr)
			System.out.print(i+" ");
	}
	public static void sort(ArrayList<Integer> arr){
		if(arr.size() == 1)
			return;
		int temp = arr.get(arr.size()-1);
		arr.remove(arr.size()-1);
		sort(arr);
		insert(arr, temp);
	}
	public static void insert(ArrayList<Integer> arr, int temp){
		if(arr.size() == 0 || arr.get(arr.size()-1) <= temp){
			arr.add(temp);
			return;
		}
		int val = arr.get(arr.size()-1);
		arr.remove(arr.size()-1);
		insert(arr, temp);
		arr.add(val);
		return;
	}
}