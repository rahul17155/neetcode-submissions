class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character>visted=new HashSet<>();
       if(s.length()==0){
        return 0;
       }
       int left=0;
       int right=0;
       int ans=Integer.MIN_VALUE;
       for(int i=0;i<s.length();i++){
          if(!visted.contains(s.charAt(i))){
            visted.add(s.charAt(i));
          }else{
            while(visted.contains(s.charAt(i))){
              visted.remove(s.charAt(left));
              left++;
            }
            visted.add(s.charAt(i));
          }
          ans=Math.max(ans,i-left+1);
          System.out.print(left+" "+i+" ");
          System.out.println(ans);
       }
       return ans;
    }
}
