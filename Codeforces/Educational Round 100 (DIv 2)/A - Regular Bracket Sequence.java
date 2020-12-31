import java.util.*;

public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            char[] arr = sc.next().toCharArray();
            int br = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i] == '?')
                    br++;
            }
            if(arr[0] == ')' || arr[arr.length-1] == '(' || br%2 != 0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}