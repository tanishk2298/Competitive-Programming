Problem Link = [https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1]
Companies = [ Adobe Amazon Flipkart Oracle OYO Rooms Snapdeal Walmart Yatra.com]

import java.util.*;
import java.io.*;
import java.lang.*;

class Parenthesis
{
    static boolean ispar(String x){
        char[] arr = x.toCharArray();
        Stack<Character> stk = new Stack<>();
        if(arr[0] == '}' || arr[0] == ')' || arr[0] == ']')
            return false;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == '{' || arr[i] == '[' || arr[i] == '(')
                stk.push(arr[i]);
            else if(stk.size() != 0){
                if(arr[i] == '}' && stk.peek() == '{')
                    stk.pop();
                else if(arr[i] == ')' && stk.peek() == '(')
                    stk.pop();
                else if(arr[i] == ']' && stk.peek() == '[')
                    stk.pop();
                else
                    return false;
            }
        }
        return stk.size() == 0;
    }
}

//Driver Function

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0)
        {
            String st = sc.next();
            if(new Parenthesis().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        }
    }
}