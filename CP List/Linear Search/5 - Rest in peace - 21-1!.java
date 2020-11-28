Problem Link -
https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/rest-in-peace-21-1/


import java.util.*;

public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int num = sc.nextInt();
            String str = Integer.toString(num);
            if(str.contains("21") || num%21 == 0)
                System.out.println("The streak is broken!");
            else
                System.out.println("The streak lives still in our heart!");   
        }
    }
}