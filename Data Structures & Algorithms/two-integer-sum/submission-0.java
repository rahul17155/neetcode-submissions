class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] indices = new int[2];
       Map<Integer,Integer>hasSum=new HashMap<>();
       for(int i=0;i<nums.length;i++){
          if(hasSum.containsKey(nums[i])){
              indices[0]=hasSum.get(nums[i]);
              indices[1]=i;
          }else{
            hasSum.put(target-nums[i],i);
          }
       }
       return indices; 
    }
}
