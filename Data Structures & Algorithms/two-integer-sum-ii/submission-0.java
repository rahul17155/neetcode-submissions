class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int first=0;
        int last=numbers.length-1;
        int[] result=new int[2];
        while(first<last){
            if(numbers[first]+numbers[last]>target){
                last--;
            }
            else if(numbers[first]+numbers[last]<target){
                first++;
            }
            else{
                   result[0]=first+1;
                   result[1]=last+1;
                   return result;
            }
        }
        return result;
    }
}
