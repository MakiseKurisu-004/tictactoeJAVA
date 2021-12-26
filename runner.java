import java.util.Scanner;

public class runner {
    public static boolean isGameOver(Board board){
        board.checkers();
        if(board.isoWon()){
            System.out.println("Os won!");
            return false;
        }
        else if(board.isxWon()){
            System.out.println("Xs won!");
            return false;
        }
        else if(board.tieChecker()){
            System.out.println("It's a tie!");
            return false;
        }
        else return true;
    }
    public static void main(String [] args){
        Board board1 = new Board();
        Scanner input = new Scanner(System.in);
        boolean isPlaying = true;
        int x, y;
        System.out.println("Tic-Tac-Toe\nYour turn is skipped if you try to put your marker on a square where a marker already exists.");
        board1.boardDisplay();
        while(isPlaying){
            isPlaying = isGameOver(board1);
            if(isPlaying == false) break;

            System.out.print("Enter your choice in coordinates (X):");
            x = input.nextInt();
            y = input.nextInt();
            board1.setX(x,y);
            board1.boardDisplay();

            isPlaying = isGameOver(board1);
            if(isPlaying == false) break;

            System.out.print("Enter your choice in coordinates (O):");
            x = input.nextInt();
            y = input.nextInt();
            board1.setO(x,y);
            board1.boardDisplay();
        }
    }
}
