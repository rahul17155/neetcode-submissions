class Solution {
    public int findMin(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int left=0,right=nums.length-1,mid;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[left]<=nums[mid]){
                ans=Math.min(ans,nums[left]);
                left=mid+1;
            }
            else{
                ans=Math.min(ans,nums[mid]);
                right=mid-1;
            }
        }
        return ans;
    }
}
