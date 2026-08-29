class Solution {
    public int findDuplicate(int[] nums) {
        
        int i=0;
        
        while(i < nums.length){
        int current = nums[i];
        if(nums[i] != nums[current]){
            swap(nums, i, current);
        }
        else{
            break;
        }
        }
        return nums[i];

    }

    void swap(int[]  nums, int f, int l){
        int temp = nums[f];
        nums[f] = nums[l];
        nums[l] = temp;
    }
}