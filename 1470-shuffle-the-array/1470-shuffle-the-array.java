class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] shuffle = new int[nums.length];

        for(int i=0;i<n;i++){
            int j = n+i;
            shuffle[i * 2] = nums[i];
            shuffle[i * 2 + 1] = nums[j];
        }
        return shuffle;
    }
}