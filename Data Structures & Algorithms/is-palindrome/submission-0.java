class Solution {
    public boolean isPalindrome(String s) {
         StringBuilder str=new StringBuilder();
         for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str.append(Character.toLowerCase(s.charAt(i)));
            }
         }
         int first=0;
         int last=str.length()-1;
         while(first<last){
            if(str.charAt(first)!=str.charAt(last)){
                return false;
            }
            first++;
            last--;
         }
        return true;
    }
}
