Problem Link = [ https://practice.geeksforgeeks.org/problems/heap-sort/1 ]
Companies = [ Amazon Belzabar Intuit Oracle Samsung SAP Labs Visa 24*7 Innovation Labs ]

import java.util.*;
import java.lang.*;
import java.io.*;

class GfG
{
    void buildHeap(int arr[], int n)
    {
        int start = (n/2) - 1;
        for(int i=start;i>=0;i--)
            heapify(arr, n, i);
    }
    void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if(left < n && arr[largest] < arr[left])
            largest = left;
        if(right < n && arr[largest] < arr[right])
            largest = right;
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
 }

// Driver code

class Heap_Sort
{
    void printArray(int arr[],int n)
    {
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        Heap_Sort hs = new Heap_Sort();
        int arr[] = new int[1000000];
        int T = sc.nextInt();
        while(T-->0)
        {
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            hs.heapSort(arr,n);
            hs.printArray(arr,n);
        }
    }
    public void heapSort(int arr[], int n)
    {
        GfG g = new GfG();
        g.buildHeap(arr, n);
        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            g.heapify(arr, i, 0);
        }
    }
}