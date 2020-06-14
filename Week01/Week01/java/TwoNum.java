class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> rMap = new HashMap<>(32);
        for(int i =0;i<nums.length;i++){
            if(rMap.containsKey(target-nums[i])){
                return new int[]{rMap.get(target-nums[i]),i};
            }
            rMap.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}