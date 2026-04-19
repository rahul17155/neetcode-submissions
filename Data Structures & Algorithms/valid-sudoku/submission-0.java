class Solution {
    public boolean isValidSudoku(char[][] board) {
       Set<Character>dupCheck=new HashSet<>();

       for(int row=0;row<9;row++){
         for(int col=0;col<9;col++){
            if(board[row][col]!='.'){
            if(dupCheck.contains(board[row][col])){
                return false;
            }else{
                dupCheck.add(board[row][col]);
            }
            }
         }
         dupCheck.clear();
       }
       for(int col=0;col<9;col++){
        for(int row=0;row<9;row++){
            if(board[row][col]!='.'){
                if(dupCheck.contains(board[row][col])){
                return false;
            }else{
                dupCheck.add(board[row][col]);
            }
            }
        }
        dupCheck.clear(); 
       }

       for(int sq=0;sq<9;sq++){
         for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                int row = (sq/3)*3+i;
                int col = (sq%3)*3+j;
                if(board[row][col]!='.'){
                 if(dupCheck.contains(board[row][col])){
                    return false;
                 }else{
                    dupCheck.add(board[row][col]);
                }
                }
            }
         }
         dupCheck.clear(); 
       }
       return true;
    }
}
