class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int j;
            for(j=i;j<temperatures.length;j++){
                if(temperatures[j]>temperatures[i]){
                    result[i]=j-i;
                    break;
                }
            }
            if(j==temperatures.length){
                result[i]=0;
            }
        }
        return result;
    }
}
