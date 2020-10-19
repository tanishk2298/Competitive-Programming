import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
	        int n = sc.nextInt();
	        HashSet<String> words = new HashSet<>();
	        for(int i=0;i<n;i++)
	            words.add(sc.next());
                int r = sc.nextInt();
                int c = sc.nextInt();
                char[][] dict = new char[r][c];
                TreeMap<Character, ArrayList<String>> map = new TreeMap<>();
                for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                        dict[i][j] = sc.next().charAt(0);
                        if(map.containsKey(dict[i][j])){
                            ArrayList<String> temp = map.get(dict[i][j]);
                            temp.add(i+" "+j);
                            map.put(dict[i][j],temp);
                        }
                        else{
                            ArrayList<String> temp = new ArrayList<>();  
                            temp.add(i+" "+j);
                            map.put(dict[i][j],temp);
                        }
                    }
                }
                boolean[][] vis = new boolean[r][c];
                for(boolean[] row : vis)
                    Arrays.fill(row, false);
                ArrayList<String> ans = new ArrayList<>();
                for(String str : words)
                    if(isPresent(str,0,-1,-1,map,vis))
                        ans.add(str);
                if(ans.size() != 0){
                    Collections.sort(ans);
                    for(String x : ans)
                        System.out.print(x+" ");
                }
                else
                    System.out.print("-1");
                System.out.println("");
	    }
	}
	public static boolean isPresent(String word, int c, int x, int y, Map<Character, ArrayList<String>> map, boolean[][] vis){
	    if(c == word.length())
	        return true;
	    if(!map.containsKey(word.charAt(c)))
	        return false;
	    ArrayList<String> temp = map.get(word.charAt(c));
	    for(String i : temp){
	        String[] xy = i.split(" ");
	        int currX = Integer.parseInt(xy[0]);
	        int currY = Integer.parseInt(xy[1]);
	        if(c==0 || isAdjacent(currX, currY, x ,y) && vis[currX][currY] == false){
	            vis[currX][currY] = true;
	            boolean flag = isPresent(word, c+1, currX, currY, map, vis);
	            vis[currX][currY] = false;
	            if(flag)
	                return true;
	        }
	    }
	    return false;
	}
	public static boolean isAdjacent(int x1, int y1, int x2, int y2){
	    return(Math.max(Math.abs(x2-x1),Math.abs(y2-y1)) <= 1);
	}
}