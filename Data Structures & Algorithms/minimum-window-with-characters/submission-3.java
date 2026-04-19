class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
          return "";
        }
        int[] hashValue=new int[256];
        for(int i=0;i<256;i++){
          hashValue[i]=0;
        }
        for(int i=0;i<t.length();i++){
          hashValue[t.charAt(i)]++;
        }
        int left=0,right=0,leftIndex=-1;
        int minlength=Integer.MAX_VALUE;
        int count=0;
        while(right<s.length()){
            if(hashValue[s.charAt(right)]>0){
              count+=1;
            }
            hashValue[s.charAt(right)]--;
            while(count==t.length()){
              if((right-left+1)<minlength){
                minlength=right-left+1;
                leftIndex=left;
              }
              hashValue[s.charAt(left)]++;
              if(hashValue[s.charAt(left)]>0){
                count--;
              }
              left++;
            }
            right+=1;
        }
        if(leftIndex==-1){
          return "";
        }
        return s.substring(leftIndex,leftIndex+minlength);
    }
}
