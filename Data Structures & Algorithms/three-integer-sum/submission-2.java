class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        int target;
        Arrays.sort(nums);
        int first;
        int second;
        int third;
        for(int i=0;i<nums.length;i++){
          if(nums[i]>0){
            return result;
          }
          if(i>0 && nums[i]==nums[i-1]){
            continue;
          }
          first=i;
          second=i+1;
          third=nums.length-1;
          while(second<third){
            if(nums[first]+nums[second]+nums[third]>0){
              third--;
            }else if(nums[first]+nums[second]+nums[third]<0){
              second++;
            }else{
              List<Integer>rs=new ArrayList<>();
              rs.add(nums[first]);
              rs.add(nums[second]);
              rs.add(nums[third]);
              result.add(rs);
              second++;
              third--;
              while(second<third && nums[second]==nums[second-1]){
                  second++;
            }
            }  
          }
        }
        return result;
    }
}
