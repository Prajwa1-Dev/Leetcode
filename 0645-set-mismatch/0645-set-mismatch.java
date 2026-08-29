class Solution {
    public int[] findErrorNums(int[] nums) {
        int i =0;
        while(i < nums.length){
            int current = nums[i] - 1;
            if(nums[i] != nums[current]){
                swap(nums, i, current);
            }else{
                i++;
            }
        }
        // int ans;
        for(i=0;i<nums.length;i++){
        if(nums[i] != i+1){
            return new int[] {nums[i], i+1};

        }
        }
        return new int[] {-1,-1};

    }

    void swap(int[] nums, int f, int l){
        int temp = nums[f];
        nums[f] = nums[l];
        nums[l] = temp;
    }
}