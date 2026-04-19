class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq=new int[26];
        if(s1.length()>s2.length()){
          return false;
        }
        for(int i=0;i<s2.length()-s1.length()+1;i++){
           String tempStr=s2.substring(i,i+s1.length());
           for(int j=0;j<26;j++){
               freq[j]=0;
              }
           for(int k=0;k<tempStr.length();k++){
                freq[tempStr.charAt(k)-'a']++;
                freq[s1.charAt(k)-'a']--;
              }
            boolean flag=true;
            for(int l=0;l<26;l++){
              if(freq[l]!=0){
                flag=false;
                break;
              }
            }
            if(flag==true){
              return true;
            }   
        }
        return false;
    }
}
