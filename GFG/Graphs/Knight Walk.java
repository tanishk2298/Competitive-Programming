import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
        public static int dx[] = { -2 , -1 , 1 , 2 , 2 , 1 , -1 , -2};
        public static int dy[] = { 1 , 2 , 2 , 1 , -1 , -2 , -2 , -1};
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-->0){
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        int[][] board = new int[n][m];
	        boolean[][] vis = new boolean[n][m];
	        for(boolean[] row : vis)
	            Arrays.fill(row,false);
	        int kX = sc.nextInt() -1;
	        int kY = sc.nextInt() -1;
	        int tX = sc.nextInt() -1;
	        int tY = sc.nextInt() -1;
	        int ans = bfs(board,vis,kX,kY,tX,tY,n,m);
	        System.out.println(ans);
	    }
	}
	public static int bfs(int[][] board, boolean[][] vis, int kX, int kY, int tX, int tY, int n, int m){
	    Queue<String> que = new LinkedList<>();
	    board[kX][kY] = 0;
	    vis[kX][kY] = true;
	    String node = kX+" "+kY;
	    que.add(node);
	    if(kX == tX && kY == tY)
	        return board[kX][kY];
	    que.add(node);
	    while(!que.isEmpty()){
	        node = que.poll();
	        String[] xy = node.split(" ");
	        int x = Integer.parseInt(xy[0]);
	        int y = Integer.parseInt(xy[1]);
	        for(int i=0;i<8;i++){
	            if(isValid(x+dx[i], y+dy[i], n, m, vis)){
	                int currX = x+dx[i];
	                int currY = y+dy[i];
	                board[currX][currY] = board[x][y] + 1;
	                vis[currX][currY] = true;
	                node = currX+" "+currY;
	                que.add(node);
	                if(currX == tX && currY == tY)
	                    return board[currX][currY];
	            }
	        }
	    }
	    return -1;
	}
	public static boolean isValid(int x,int y,int n, int m, boolean[][] vis){
	    if(x<0 || x>=n || y<0 || y>=m || vis[x][y])
	        return false;
	    return true;
	}
}


