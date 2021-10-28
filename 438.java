class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] snum = new int[26], pnum = new int[26];
        int slen = s.length(), plen = p.length();
        List<Integer> ans = new ArrayList<>();
        if(slen < plen) return ans;
        for(int i = 0;i < plen;i ++) {
            snum[s.charAt(i) - 'a'] ++;
            pnum[p.charAt(i) - 'a'] ++;
        }
        if(Arrays.equals(snum, pnum)) ans.add(0);
        for(int i = plen;i < slen;i ++) {
            snum[s.charAt(i) - 'a'] ++;
            snum[s.charAt(i-plen) - 'a'] --;
            if(Arrays.equals(snum, pnum)) ans.add(i-plen+1);
        }
        return ans;
    }
}