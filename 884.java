class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for(String word : s1.split(" ")) map.put(word, map.getOrDefault(word, 0) + 1);
        for(String word : s2.split(" ")) map.put(word, map.getOrDefault(word, 0) + 1);

        for(String word : map.keySet()) {
            if(map.get(word) == 1) ans.add(word);
        }
        return ans.toArray(new String[ans.size()]);
    }
}