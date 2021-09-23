class Solution {
    public String originalDigits(String s) {
        StringBuffer ss = new StringBuffer();
        HashMap<Character, Integer> map = new HashMap<>();
        int[] num = new int[10];
        for(int i = 0;i < s.length();i ++) map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        num[0] = map.getOrDefault('z', 0);
        num[2] = map.getOrDefault('w', 0);
        num[6] = map.getOrDefault('x', 0);
        num[8] = map.getOrDefault('g', 0);
        num[3] = map.getOrDefault('t', 0) - num[2] - num[8];
        num[7] = map.getOrDefault('s', 0) - num[6];
        num[4] = map.getOrDefault('r', 0) - num[0] - num[3];
        num[1] = map.getOrDefault('o', 0) - num[0] - num[2] - num[4];
        num[5] = map.getOrDefault('f', 0) - num[4];
        num[9] = (map.getOrDefault('n', 0) - num[1] - num[7])/2;
        
        for(int i = 0;i < 10;i ++) {
            while(num[i] > 0) {
                num[i] --;
                ss.append(i + "");
            }
        }
        return ss.toString();
    }
}