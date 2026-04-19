class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProd = new int[nums.length];
        int[] suffixProd = new int[nums.length];
        int[] productRes = new int[nums.length];
        prefixProd[0]=1;
        suffixProd[nums.length-1]=1;
        for(int i=0;i<nums.length-1;i++){
            prefixProd[i+1]=prefixProd[i]*nums[i];
        }
        for(int i=nums.length-1;i>0;i--){
            suffixProd[i-1]=suffixProd[i]*nums[i];
        }

        for(int i=0;i<nums.length;i++){
            productRes[i] = prefixProd[i]*suffixProd[i];
        }
        return productRes;
    }
}  
