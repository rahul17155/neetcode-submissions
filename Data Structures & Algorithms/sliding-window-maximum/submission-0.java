class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int result[] = new int[nums.length-k+1];
        int count=0;
        for(int i=0;i<=nums.length-k;i++){
             int max=Integer.MIN_VALUE;
             for(int j=i;j<i+k;j++){
                max=Math.max(max,nums[j]);
             }
             result[count]=max;
             count++;
        }
        return result;
    }
}
