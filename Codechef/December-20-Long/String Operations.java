import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            String str = sc.next();
            Set<String> set = new HashSet<>();
            for(int i=0;i<str.length();i++){
                int odd,even,cnt;
                odd = even = cnt = 0;
                for(int j=i;j<str.length();j++){
                    if(str.charAt(j) == '1')
                        cnt++;
                    else{
                        if(cnt%2 == 0)
                            odd++;
                        else
                            even++;
                    }
                    set.add(cnt+" "+even+" "+odd);
                }
            }
            System.out.println(set.size()); 
        }
    }
}
