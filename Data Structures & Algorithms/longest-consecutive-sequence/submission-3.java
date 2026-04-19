class Solution {
    public int longestConsecutive(int[] nums) {
    //    if(nums.length==0){
    //     return 0;
    //    }
    //    int curr_cnt=1;
    //    int longest_seq=1;
    //    int curr_ele=Integer.MIN_VALUE;
    //    Arrays.sort(nums);
    //    for(int i=0;i<nums.length;i++){
    //       if(nums[i]-1==curr_ele){
    //         curr_ele=nums[i];
    //         curr_cnt+=1;
    //         }
    //       else if(nums[i]!=curr_ele){
    //         curr_ele=nums[i];
    //         curr_cnt=1;
    //        }
    //       longest_seq=Math.max(longest_seq,curr_cnt);
    //     }
    //     return longest_seq;
      int longest_seq=1;
      if(nums.length==0){
        return 0;
      }
      HashSet<Integer>nums_set=new HashSet<>();
      for(int i=0;i<nums.length;i++){
        nums_set.add(nums[i]);
      }
      for(Integer num:nums_set){
        if(!nums_set.contains(num-1)){
           int curr_el=num;
           int curr_cnt=1;
           while(nums_set.contains(curr_el+1)){
            curr_el+=1;
            curr_cnt+=1;
           }
           longest_seq=Math.max(curr_cnt,longest_seq);
        }
      }
      return longest_seq;

    }
}
    
