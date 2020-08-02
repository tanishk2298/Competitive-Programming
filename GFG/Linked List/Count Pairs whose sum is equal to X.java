class GfG {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {
        HashSet<Integer> set = new HashSet<>();
        Iterator itr = head1.iterator();
        int count = 0;
        while(itr.hasNext())
            set.add((Integer)itr.next());
        itr = head2.iterator();
        while(itr.hasNext())
            if(set.contains(x-(Integer)itr.next()))
                count++;
        return count;
    }
}
