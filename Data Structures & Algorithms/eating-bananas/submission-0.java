class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
       for(int i=0;i<piles.length;i++){
          max=Math.max(piles[i],max);
       }
       int left=1,right=max;
       while(left<=right){
         int mid=left+(right-left)/2;
         int hours=CalcTime(piles,mid);
         if(hours>h){
            left=mid+1;
         }else{
            right=mid-1;
         }
       }
       return left;
    }
    public int CalcTime(int[] piles,int k){
        int time=0;
        for(int i=0;i<piles.length;i++){
            time+=(int)Math.ceil((double)piles[i]/k);
        }
        return time;
    }
}
