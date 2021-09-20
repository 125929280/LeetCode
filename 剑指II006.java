class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length, i = 0,j = len - 1;
        while(i < j && i < len && j >= 0) {
            if(numbers[i] + numbers[j] == target) return new int[]{i, j};
            else if(numbers[i] + numbers[j] < target) i ++;
            else j --;
        }
        return new int[]{};
    }
}