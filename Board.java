public class Board {
    private int board [][] = new int [3][3];
    private boolean xWon = false;
    private boolean oWon = false;
    //methods
    public void boardDisplay(){
        String c = "";
        for(int i = 0; i<3; i++){
            System.out.print("|");
            for(int j = 0; j<3; j++){
                if (board[i][j] == 1) {
                    c = "X";
                }
                else if (board[i][j] == -1){
                    c = "O";
                }
                else if (board[i][j] == 0){
                    c = " ";
                }
                System.out.print(c + "|");
            }
            System.out.println();
        }
    }
    public void checkers(){
        rowChecker();
        columnChecker();
        diagonalChecker();
    }
    public void rowChecker(){
        int sum = 0;
        for (int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++){
                sum += board[i][j];
                if(sum == 3) {
                    xWon = true;
                    break;
                }
                else if(sum == -3){
                    oWon = true;
                    break;
                }
            }
            sum = 0;
        }
    }
    public void columnChecker(){
        int sum = 0;
        for (int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++){
                sum += board[j][i];
                if(sum == 3) {
                    System.out.println("Xs won");
                    break;
                }
                else if(sum == -3){
                    System.out.println("Os won");
                    break;
                }
            }
            sum = 0;
            if(sum == 3) {
                xWon = true;
                break;
            }
            else if(sum == -3){
                oWon = true;
                break;
            }
        }
    }
    public void diagonalChecker(){
        int sum = 0;
        int j = 0;
        for(int i = 0; i<3;i++){
            sum += board[i][j];
            j++;
            if(sum == 3) {
                xWon = true;
                break;
            }
            else if(sum == -3){
                oWon = false;
                break;
            }
        }
        sum = 0;
        j = 2;
        for(int i = 0; i<3;i++){
            sum += board[i][j];
            j--;
            if(sum == 3) {
                xWon = true;
                break;
            }
            else if(sum == -3){
                oWon = true;
                break;
            }
        }
    }
    public boolean tieChecker(){
        for(int i =0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(board[i][j] == 0) return false;
            }
        }
        return true;
    }
    public void setX(int x, int y){
        if (this.board [x][y] == 0)
            this.board[x][y] = 1;
    }
    public void setO(int x, int y){
        if (board [x][y] == 0)
        board[x][y] = -1;
    }
    // constructors
    public Board() {}
    //getters and setters
    public int[][] getBoard() {
        return board;
    }
    public void setBoard(int[][] board) {
        this.board = board;
    }
    public boolean isxWon() {
        return xWon;
    }
    public boolean isoWon() {
        return oWon;
    }
}
