import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
        public static int[] dx = {-1,0,1,0};
        public static int[] dy = {0,1,0,-1};
	public static void main (String[] args)throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int tc = Integer.parseInt(br.readLine());
	    while(tc-->0){
	        String[] nm = br.readLine().split(" ");
	        int n = Integer.parseInt(nm[0]);
	        int m = Integer.parseInt(nm[1]);
	        int[][] mat = new int[n][m];
	        String[] inp = br.readLine().split(" ");
	        int cnt = 0;
	        for(int i=0;i<n;i++)
	            for(int j=0;j<m;j++)
	                mat[i][j] = Integer.parseInt(inp[cnt++]);
                Queue<String> que = new LinkedList<>();
                String node;
                for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                        if(mat[i][j] == 2){
                            node = i+" "+j+" "+0;
                            que.add(node);
                        }
                    }
                }
                int ans = 0;
                while(!que.isEmpty()){
                    String curr = que.poll();
                    String[] xyv = curr.split(" ");
                    int x = Integer.parseInt(xyv[0]);
                    int y = Integer.parseInt(xyv[1]);
                    int val = Integer.parseInt(xyv[2]);
                    ans = Math.max(ans,val);
                    for(int i=0;i<4;i++){
                        int currX = x+dx[i];
                        int currY = y+dy[i];
                        int currV = val + 1;
                        if(isValid(currX,currY,n,m,mat)){
                            curr = currX+" "+currY+" "+currV;
                            mat[x+dx[i]][y+dy[i]] = 2;
                            que.add(curr);
                        }
                    }
                }
                boolean flag = false;
                for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++){
                        if(mat[i][j] == 1){
                            flag = true;
                            break;
                        }
                    }
                }
                if(flag)
                    System.out.println(-1);
                else
                    System.out.println(ans);
	    }
	}
	public static boolean isValid(int x, int y, int n, int m, int[][] mat){
	    return(x>=0 && x<n && y>=0 && y<m && mat[x][y] == 1);
	}
}
