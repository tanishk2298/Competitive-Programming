import java.io.*;
import java.util.*;

class GfG
{
    public HashMap<String,Boolean> map = new HashMap<>();
    int wildCard(String pattern, String str)
    {
        map.clear();
        if(patternMatch(pattern,str,0,0))
            return 1;
        return 0;
    }
    public boolean patternMatch(String a, String b, int i, int j){
        String temp = (i+" "+j).toString();
        if(map.containsKey(temp))
            return map.get(temp);
        if(i == a.length()){
            map.put(temp,(j==b.length()));
            return map.get(temp);
        }
        if(j == b.length()){
            for(int k=i;k<a.length();k++){
                if(a.charAt(k) != '*'){
                    map.put(temp, false);
                    return map.get(temp);
                }
            }
            map.put(temp, true);
            return map.get(temp);
        }
        if(a.charAt(i) == '?' || a.charAt(i) == b.charAt(j)){
            map.put(temp, patternMatch(a,b,i+1,j+1));
            return map.get(temp);
        }
        if(a.charAt(i) == '*'){
            boolean cond1 = patternMatch(a,b,i+1,j);
            boolean cond2 = patternMatch(a,b,i,j+1);
            map.put(temp,(cond1||cond2));
            return map.get(temp);
        }
        map.put(temp,false);
        return map.get(temp);
    }
}

//Driver Function

class WildcardPattern
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String pat = sc.nextLine();
			String text = sc.nextLine();
			GfG g = new GfG();
			System.out.println(g.wildCard(pat,text));
			t--;
		}
	}
}