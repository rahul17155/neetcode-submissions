class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         
        List<Integer>[] counts = new List[nums.length+1];
        for(int i=0;i<counts.length;i++){
            counts[i]=new ArrayList<>();
        }
        Map<Integer,Integer>numsFreq = new HashMap<>();

        for(int i=0;i<nums.length;i++){
             if(!numsFreq.containsKey(nums[i])){
                numsFreq.put(nums[i],1);
             }else{
                numsFreq.put(nums[i],numsFreq.get(nums[i])+1);
             }
        }
        
        for(Map.Entry<Integer,Integer>it:numsFreq.entrySet()){
              counts[it.getValue()].add(it.getKey());
        }
        int[] resultSet=new int[k];
        int index=0;
        for(int i=counts.length-1;i>=0;i--){
             for(int k1=0;k1<counts[i].size();k1++){
                 if(index==k){
                    return resultSet;
                 }
                 resultSet[index]=counts[i].get(k1);
                 index++;
             }
        }
        return resultSet;
    }
}
