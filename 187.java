class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for(int i = 0;i <= s.length() - 10;i ++) {
            String cur = s.substring(i, i+10);
            map.put(cur, map.getOrDefault(cur, 0) + 1);
        }
        for(String key : map.keySet()) {
            if(map.get(key) > 1) ans.add(key);
        }
        return ans;
    }
}