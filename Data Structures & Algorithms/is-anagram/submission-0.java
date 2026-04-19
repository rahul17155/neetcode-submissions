class Solution {
    public boolean isAnagram(String s, String t) {
       int[] string1=new int[26];
       for(int i=0;i<26;i++){
          string1[i]=0;
       }
       for(int i=0;i<s.length();i++){
          string1[s.charAt(i)-'a']++;
       }
       for(int i=0;i<t.length();i++){
          string1[t.charAt(i)-'a']--;
       }
       for(int i=0;i<26;i++){
           if(string1[i]!=0){
            return false;
           }
       }
       return true;

    }
}
