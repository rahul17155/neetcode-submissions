class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hashList = new HashMap<>();
        List<List<String>> anagramList = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String newStr = new String(str);
            if(hashList.containsKey(newStr)){
                List<String> value = new ArrayList<>(hashList.get(newStr));
                value.add(strs[i]);
                hashList.put(newStr,value);
            }else{
                 hashList.put(newStr,List.of(strs[i]));
            }
        }
        for( String key:hashList.keySet()){
            anagramList.add(hashList.get(key));
        }
        return anagramList;
    }
}
