class Solution {
    public char firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        // char ans = ' ';
        for(char i : s.toCharArray()) map.put(i, map.getOrDefault(i, 0) + 1);
        for(char i : s.toCharArray()) if(map.get(i) == 1) return i;
        return ' ';
    }
}