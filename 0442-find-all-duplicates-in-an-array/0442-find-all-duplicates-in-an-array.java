class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        int i = 0;
        while(i < nums.length){
            int current = nums[i] - 1;
            if(nums[i] != nums[current]){
                swap(nums, i, current);
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(i = 0; i<nums.length;i++){
        if(nums[i] != i+1){
            ans.add(nums[i]);
        }
        }
        return ans;
    }

    void swap(int[] nums,int f, int l){
        int temp = nums[f];
        nums[f] = nums[l];
        nums[l] = temp;
    }
}