class Solution {

    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            if(!isValidRow(board, i) || !isValidColumn(board, i) || !isValidSubBox(board, i)){
                return false;
            } 
        }
        return true;
    }

    public boolean isValidRow(char[][] board, int row){
        HashSet<Character> seen = new HashSet<>();

        for(int col = 0; col < 9; col++){
            char val = board[row][col];
            if(val == '.') continue;
            if(seen.contains(val)) return false;
            seen.add(val);
        }
        return true;
    }

    public boolean isValidColumn(char[][] board, int col){
        HashSet<Character> seen = new HashSet<>();

        for(int row = 0; row < 9; row++){
            char val = board[row][col];
            if(val == '.') continue;
            if(seen.contains(val)) return false;
            seen.add(val);
        }
        return true;
    }

    public boolean isValidSubBox(char[][] board, int index){
        HashSet<Character> seen = new HashSet<>();

        int startRow = (index / 3) * 3;
        int startCol = (index % 3) * 3;

        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 3; c++){
                char val = board[startRow + r][startCol + c];
                if(val == '.') continue;
                if(seen.contains(val)) return false;
                seen.add(val);
            }
        }
        return true;
    }
}
