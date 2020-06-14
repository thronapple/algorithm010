class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        boolean b = false;
        for(int i = 0; i <nums.length; i++){
            if(nums[i]!=0&&b){
                if(i!=index) {
                    nums[index++] = nums[i];
                    nums[i] = 0;
                }
            }else if(nums[i]==0){
                b = true;
            }else{
                index++;
            }
        }
    }
}