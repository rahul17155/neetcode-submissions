class Solution {
    public int maxArea(int[] heights) {
        int max_water=Integer.MIN_VALUE;
        int lp=0;
        int rp=heights.length-1;
        while(lp<rp){
          int height=Math.min(heights[lp],heights[rp]);
          int water=height*(rp-lp);
          max_water=Math.max(max_water,water);
          if(heights[lp]<heights[rp]){
            lp++;
          }else if(heights[lp]>heights[rp]){
            rp--;
          }else{
            lp++;
          }
        }
        return max_water;
    }
}
