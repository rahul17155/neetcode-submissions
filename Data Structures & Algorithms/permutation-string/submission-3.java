class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freqS1=new int[26];
        int[] freqS2=new int[26];
        for(int i=0;i<26;i++){
          freqS1[i]=0;
          freqS2[i]=0;
        }
        
        if(s1.length()>s2.length()){
          return false;
        }
        // for(int i=0;i<s2.length()-s1.length()+1;i++){
        //    String tempStr=s2.substring(i,i+s1.length());
        //    for(int j=0;j<26;j++){
        //        freq[j]=0;
        //       }
        //    for(int k=0;k<tempStr.length();k++){
        //         freq[tempStr.charAt(k)-'a']++;
        //         freq[s1.charAt(k)-'a']--;
        //       }
        //     boolean flag=true;
        //     for(int l=0;l<26;l++){
        //       if(freq[l]!=0){
        //         flag=false;
        //         break;
        //       }
        //     }
        //     if(flag==true){
        //       return true;
        //     }   
        // }
        int left=0,right=s1.length();
        for(int i=0;i<s1.length();i++){
           freqS1[s1.charAt(i)-'a']++;
           freqS2[s2.charAt(i)-'a']++;
        }
        for(int i=s1.length();i<s2.length();i++){
          boolean flag=true;
          for(int j=0;j<26;j++){
            if(freqS1[j]!=freqS2[j]){
                flag=false;
            }
          }
          if(flag==true){
            return true;
          }
          freqS2[s2.charAt(i)-'a']++;
          freqS2[s2.charAt(left)-'a']--;
          left++;
          right++;
        }
        boolean flag=true;
        for(int i=0;i<26;i++){
          if(freqS1[i]!=freqS2[i]){
            flag=false;
            break;
          }
        }
        if(flag==true){
          return true;
        }
        return false;
    }
}
