class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int result[] = new int[nums.length-k+1];
        // int count=0;
        // for(int i=0;i<=nums.length-k;i++){
        //      int max=Integer.MIN_VALUE;
        //      for(int j=i;j<i+k;j++){
        //         max=Math.max(max,nums[j]);
        //      }
        //      result[count]=max;
        //      count++;
        // }
        int len=nums.length;
        Deque<Integer>dq=new ArrayDeque<>();
        int l=0,r=0;
        while(r<len){
             while(!dq.isEmpty() && nums[dq.getLast()]<nums[r]){
                dq.removeLast();
             }
             dq.addLast(r);
             if(l>dq.getFirst()){
                dq.removeFirst();
             }
             if(r+1>=k){
                result[l]=nums[dq.getFirst()];
                l++;
             }
             r++;

        }
        return result;
    }
}
