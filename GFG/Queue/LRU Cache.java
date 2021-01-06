Problem Link = [ https://practice.geeksforgeeks.org/problems/lru-cache/1 ] 
Comapnies = [  Adobe Amazon Flipkart Goldman Sachs Hike MakeMyTrip Morgan Stanley Ola Cabs OYO Rooms Paytm Samsung Snapdeal Visa Walmart Yahoo Zoho ] 


import java.util.*;

class LRUCache
{
    int size;
    HashMap<Integer,Integer> map = new HashMap<>();
    Queue<Integer> que = new LinkedList<>();
    LRUCache(int cap)
    {
        que.clear();
        map.clear();
        size = cap;
    }

    public int get(int key)
    {
        if(!map.containsKey(key))
            return -1;
        que.remove(key);
        que.add(key);
        return map.get(key);
    }

    public void set(int key, int value)
    {
        if(que.size() == size && !que.contains(key))
            map.remove(que.poll());
        if(map.containsKey(key))
            que.remove(key);
        que.add(key);
        map.put(key, value);
    }
}

//Driver code

public class LRUDesign {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(read.readLine());
	while (t-- > 0) {
            int capacity = Integer.parseInt(read.readLine());
            int queries = Integer.parseInt(read.readLine());
            LRUCache cache = new LRUCache(capacity);
            String str[] = read.readLine().trim().split(" ");
            int len = str.length;
            int itr = 0;
            for (int i = 0; (i < queries) && (itr < len); i++) {
                String queryType = str[itr++];
                if (queryType.equals("SET")) {
                    int key = Integer.parseInt(str[itr++]);
                    int value = Integer.parseInt(str[itr++]);
                    cache.set(key, value);
                }
                if (queryType.equals("GET")) {
                    int key = Integer.parseInt(str[itr++]);
                    System.out.print(cache.get(key) + " ");
                }
            }
            System.out.println();
        }
    }
}