class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer>hasDuplicate = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hasDuplicate.containsKey(nums[i])){
                return true;
            }else{
                hasDuplicate.put(nums[i],1);
            }
        }
        return false;

    }
}