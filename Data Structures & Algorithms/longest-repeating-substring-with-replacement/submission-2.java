class Solution {
    public int characterReplacement(String s, int k) {
        int res=Integer.MIN_VALUE;
        int left=0;
        int maxFreq=Integer.MIN_VALUE;
        Map<Character,Integer>freq=new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //   Map<Character,Integer>freq=new HashMap<>();
        //   int maxFreq=Integer.MIN_VALUE;
        //   for(int j=i;j<s.length();j++){
        //     freq.put(s.charAt(j),freq.getOrDefault(s.charAt(j),0)+1);
        //     maxFreq=Math.max(maxFreq,freq.get(s.charAt(j)));
        //     if(((j-i+1)-maxFreq<=k)){
        //       res=Math.max(res,j-i+1);
        //     }
        //   }
        // }
        for(int i=0;i<s.length();i++){
             freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
             maxFreq=Math.max(maxFreq,freq.get(s.charAt(i)));
             while((i-left+1)-maxFreq>k){
              int fre=freq.get(s.charAt(left));
              freq.put(s.charAt(left),fre-1);
              left++;
             }
             res=Math.max(res,(i-left+1));
        }
        return res;
    }
}
