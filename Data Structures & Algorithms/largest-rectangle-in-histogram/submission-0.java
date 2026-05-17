class Solution {
    public int largestRectangleArea(int[] heights) {
       int[] PSE = new int[heights.length];
       int[] NSE = new int[heights.length];
       Stack<Integer>st=new Stack<>();
       PSE[0]=-1;
       st.push(0);
       NSE[heights.length-1]=heights.length;
       for(int i=1;i<heights.length;i++){
           while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
            st.pop();
           }
           PSE[i]=st.isEmpty()?-1:st.peek();
           st.push(i);
       }
       st.clear();
       st.push(heights.length-1);
       for(int i=heights.length-2;i>=0;i--){
           while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
            st.pop();
           }
           NSE[i]=st.isEmpty()?heights.length:st.peek();
           st.push(i);
       }
       int maxArea=Integer.MIN_VALUE;
       for(int i=0;i<heights.length;i++){
        System.out.print(PSE[i]);
        System.out.print(NSE[i]);
         int area=heights[i]*(NSE[i]-PSE[i]-1);
         if(area>maxArea){
            maxArea=area;
         }
       }
       return maxArea;
    }
}
