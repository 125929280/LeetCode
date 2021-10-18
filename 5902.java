class Solution {
    public boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        int cur = 0;
        for(String word : words) {
            if(word.charAt(0) >= '0' && word.charAt(0) <= '9') {
                if(Integer.parseInt(word) > cur) cur = Integer.parseInt(word);
                else return false;
            }
        }
        return true;
    }
}