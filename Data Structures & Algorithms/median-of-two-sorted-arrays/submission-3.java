class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //     int i=0,j=0,n=(nums1.length+nums2.length),k=0,pos1=0,pos2=0;
    //     int index1=n/2;
    //     int index2=n/2 - 1;
    //     while(i<nums1.length && j<nums2.length){
    //         if(nums1[i]<nums2[j]){
    //             if(k==index1) pos1=nums1[i];
    //             if(k==index2) pos2=nums1[i];
    //             i++;
    //         }
    //         else{
    //             if(k==index1) pos1=nums2[j];
    //             if(k==index2) pos2=nums2[j];
    //             j++;
    //         }
    //         k++;
    //     }
    //     while(i<nums1.length){
    //         if(k==index1) pos1=nums1[i];
    //         if(k==index2) pos2=nums1[i];
    //         i++;
    //         k++;
    //     }
    //     while(j<nums2.length){
    //         if(k==index1) pos1=nums2[j];
    //         if(k==index2) pos2=nums2[j];
    //         j++;
    //         k++;
    //     }
    //     if(n%2==1){
    //         return pos1;
    //     }
    //     return (pos1+pos2)/2.0;
    // }
    // Optimal approach
    if(nums1.length>nums2.length) return findMedianSortedArrays(nums2,nums1);
    int left=0;
    int n=(nums1.length+nums2.length+1)/2;
    int count=nums1.length+nums2.length;
    int right=nums1.length;
    int mid1=0,mid2=0;
    while(left<=right){
        mid1=(left+right)/2;
        mid2=n-mid1;
        int left1=Integer.MIN_VALUE,left2=Integer.MIN_VALUE;
        int right1=Integer.MAX_VALUE,right2=Integer.MAX_VALUE;
        if(mid1<nums1.length) right1=nums1[mid1];
        if(mid2<nums2.length) right2=nums2[mid2];
        if(mid1-1>=0) left1=nums1[mid1-1];
        if(mid2-1>=0) left2=nums2[mid2-1];
        if(left1<=right2 && left2<=right1){
            if(count%2==0){
                return (double)(Math.max(left1,left2)+Math.min(right1,right2))/2.0;
            }else{
                return (double)(Math.max(left1,left2));
            }
        }
        else if(left1>right2){
            right=mid1-1;
        }
        else{
            left=mid1+1;
        }
    }
    return 0.0;
}
}
