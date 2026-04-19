class Solution {

    public String encode(List<String> strs) {
        if(strs.size()==0){
            return Character.toString((char)258);
        }
        String delimeter = Character.toString((char)257);
        StringBuilder encodedStr = new StringBuilder();
        for(String st:strs){
           encodedStr.append(st);
           encodedStr.append(delimeter);
        }
        encodedStr.deleteCharAt(encodedStr.length()-1);
        return encodedStr.toString();
    }

    public List<String> decode(String str) {
        if(str.equals(Character.toString((char)258))){
            List<String>str1 = new ArrayList<>();
            return str1;
        }
        String delimeter = Character.toString((char)257);
        return Arrays.asList(str.split(delimeter));
    }
}
