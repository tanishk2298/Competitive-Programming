class GfG
{
    public static boolean compute(Node node)
    {
       String str = "";
       Node n = node;
       while(n!=null){
           str += n.data;
           n = n.next;
       }
       for(int i=0;i<(str.length())/2;i++)
           if(str.charAt(i) != str.charAt((str.length()-i-1)))
                return false;
       return true;
    }
}