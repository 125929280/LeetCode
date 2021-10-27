class Solution {
    public String reverseWords(String s) {
        // split
        // String[] words = s.split(" ");
        // StringBuilder sb = new StringBuilder();
        // for(int i = words.length-1;i >= 0;i --) {
        //     if(words[i].equals("") == false) sb.append(words[i] + " ");
        // }
        // return sb.toString().trim();

        // two-pointers
        s = s.trim();
        int r = s.length()-1, l = r;
        StringBuilder sb = new StringBuilder();
        while(l >= 0) {
            while(l >= 0 && s.charAt(l) != ' ') l --;
            sb.append(s.substring(l+1, r+1) + " ");
            while(l >= 0 && s.charAt(l) == ' ') l --;
            r = l;
        }
        return sb.toString().trim();
    }
}