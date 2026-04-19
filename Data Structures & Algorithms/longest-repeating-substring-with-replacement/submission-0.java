class Solution {
    public int characterReplacement(String s, int k) {
        int res=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
          Map<Character,Integer>freq=new HashMap<>();
          int maxFreq=Integer.MIN_VALUE;
          for(int j=i;j<s.length();j++){
            freq.put(s.charAt(j),freq.getOrDefault(s.charAt(j),0)+1);
            maxFreq=Math.max(maxFreq,freq.get(s.charAt(j)));
            if(((j-i+1)-maxFreq<=k)){
              res=Math.max(res,j-i+1);
            }
          }
        }
        return res;
    }
}
