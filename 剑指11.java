class Solution {
    public int minArray(int[] numbers) {
        int l = 0, r = numbers.length-1;
        while(l < r) {
            int m = l + (r-l)/2;
            if(numbers[m] < numbers[r]) r = m;
            else if(numbers[m] > numbers[r]) l = m+1;
            else r --;
        }
        return numbers[l];
    }
}