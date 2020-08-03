class GfG
{
    int compare(Node node1, Node node2)
    {
        int ans = 0;
        while(node1 != null && node2 != null){
            if(node1.data == node2.data)
                ans = 0;
            if(node1.data > node2.data)
                return 1;
            if(node1.data < node2.data)
                return -1;
            node1 = node1.next;
            node2 = node2.next;
        }
        return ans;
    }
}