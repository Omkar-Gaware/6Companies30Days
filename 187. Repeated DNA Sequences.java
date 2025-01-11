class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new LinkedList<>();
        HashSet<String> set = new HashSet();

        int si = 0;
        int ei = 10;

        while(ei <= s.length()){
            String str = s.substring(si,ei);

            if(set.contains(str)){
                if(!list.contains(str)){
                    list.add(str);
                }
            }else{
                set.add(str);
            }
            ei++;
            si++;
        }
        return list;
    }
}