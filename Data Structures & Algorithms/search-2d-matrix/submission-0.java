class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            if(matrix[i][0]<=target && matrix[i][col-1]>=target){
                return BinarySearch(matrix,i,col,target);
            }
        }
        return false;
    }
    public boolean BinarySearch(int[][] matrix,int row,int col,int target){
        int left=0;
        int right=col-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(matrix[row][mid]==target){
                return true;
            }
            else if(matrix[row][mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return false;
    }
}
