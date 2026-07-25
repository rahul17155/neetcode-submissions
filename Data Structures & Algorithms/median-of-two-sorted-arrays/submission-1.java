class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer>merged=new ArrayList<>();
        int i=0,j=0,n=(nums1.length+nums2.length),k=0,pos1=0,pos2=0;
        int index1=n/2;
        int index2=n/2 - 1;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                if(k==index1) pos1=nums1[i];
                if(k==index2) pos2=nums1[i];
                i++;
            }
            else{
                if(k==index1) pos1=nums2[j];
                if(k==index2) pos2=nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            if(k==index1) pos1=nums1[i];
            if(k==index2) pos2=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            if(k==index1) pos1=nums2[j];
            if(k==index2) pos2=nums2[j];
            j++;
            k++;
        }
        if(n%2==1){
            return pos1;
        }
        return (pos1+pos2)/2.0;
    }
}
