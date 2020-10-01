import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static HashMap<String,Boolean> map = new HashMap<>();
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
	        map.clear();
	        int n = sc.nextInt();
	        ArrayList<String> arr = new ArrayList<>();
	        for(int i=0;i<n;i++)
	            arr.add(sc.next());
	        String str = sc.next();
	        if(wordBreak(str,arr))
	            System.out.println(1);
	        else
	            System.out.println(0);
	    }
	}
	public static boolean wordBreak(String str, ArrayList<String> arr){
	    if(str.equals(""))
	        return true;
	    if(map.containsKey(str))
	        return map.get(str);
	    for(int i=1;i<=str.length();i++){
	        boolean cond1 = arr.contains(str.substring(0,i));
	        boolean cond2 = wordBreak(str.substring(i,str.length()),arr);
	        if(cond1 && cond2){
	            map.put(str.substring(i,str.length()),true);
	            return true;
	        }
	    }
	    map.put(str,false);
	    return false;
	}
}