import java.util.*;

public class MyClass 
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            String str = sc.next();
            long cnt = 0;
            for(int i=(n-1);i>=0;i--){
                if(str.charAt(i) == ')')
                    cnt++;
                else
                    break;
            }
            if(cnt>(n/2))
                System.out.println("YES"); 
            else
                System.out.println("NO");
        }
    }
}