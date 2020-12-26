import java.util.*;
import java.lang.*;
import java.io.*;

class solve{
    public static int evaluatePostFix(String exp){
        Stack<Integer> nums = new Stack<>();
        int sum = 0;
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                int b = nums.pop();
                int a = nums.pop();
                if(ch == '+')
                    sum = a+b;
                else if(ch == '-')
                    sum = a-b;
                else if(ch == '*')
                    sum = a*b;
                else if(ch == '/')
                    sum = a/b;
                nums.push(sum);
            }
            else
                nums.push(Character.getNumericValue(ch));
        }
        return nums.pop();
    }
}

//Driver Function

class GFG {
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0)
		    System.out.println(new solve().evaluatePostFix(br.readLine().trim()));
    }
}