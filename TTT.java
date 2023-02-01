import java.util.Scanner;

public class TTT {
    static String[][] grid = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
    static Scanner s = new Scanner(System.in);
    static class Move {
        int row, col;
    }
    static String computer = "O", human = "X";

    public static void main(String[] args) {
        TTT_HOME();
    }
    public static void TTT_HOME(){
        System.out.println("WELCOME TO TIC TAC TOE!");
        System.out.println("The Grid is : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + grid[i][j] + " |");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = " ";
            }
        }

        System.out.println("\nLets start the game!\n");
        System.out.print("Chose game mode (2P/AI) : ");
        String choice = s.next().toUpperCase();

        if ("2P".equals(choice))
            TTT_P();
        else if ("AI".equals(choice))
            TTT_AI();
    }
    public static void TTT_P() {
        int g = 0;
        while(g < 9) {
            System.out.print("Turn for X : ");
            int x = s.nextInt();
            switch (x) {
                case 1 -> {
                    if (!"O".equals(grid[0][0])) {
                        grid[0][0] = "X";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                }
                case 2 -> {
                    if (!"O".equals(grid[0][1])) {
                        grid[0][1] = "X";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                }
                case 3 -> {
                    if (!"O".equals(grid[0][2])) {
                        grid[0][2] = "X";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                }
                case 4 -> {
                    if (!"O".equals(grid[1][0])) {
                        grid[1][0] = "X";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                }
                case 5 -> {
                    if (!"O".equals(grid[1][1])) {
                        grid[1][1] = "X";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                }
                case 6 -> {
                    if (!"O".equals(grid[1][2])) {
                        grid[1][2] = "X";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                }
                case 7 -> {
                    if (!"O".equals(grid[2][0])) {
                        grid[2][0] = "X";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                }
                case 8 -> {
                    if (!"O".equals(grid[2][1])) {
                        grid[2][1] = "X";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                }
                case 9 -> {
                    if (!"O".equals(grid[2][2])) {
                        grid[2][2] = "X";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                }
                default -> System.out.println("Wrong Input\nMiss the Turn!");
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("| " + grid[i][j] + " |");
                }
                System.out.println();
            }

            if (grid[0][0].equals("X") && grid[0][1].equals("X") && grid[0][2].equals("X") || grid[1][0].equals("X") && grid[1][1].equals("X") && grid[1][2].equals("X") || grid[2][0].equals("X") && grid[2][1].equals("X") && grid[2][2].equals("X") || grid[0][0].equals("X") && grid[1][0].equals("X") && grid[2][0].equals("X") || grid[0][1].equals("X") && grid[1][1].equals("X") && grid[2][1].equals("X") || grid[0][2].equals("X") && grid[1][2].equals("X") && grid[2][2].equals("X") || grid[0][0].equals("X") && grid[1][1].equals("X") && grid[2][2].equals("X") || grid[0][2].equals("X") && grid[1][1].equals("X") && grid[2][0].equals("X")) {
                System.out.print("X Wins!");
                return;
            }

            System.out.println();
//O
            System.out.print("Turn for O : ");
            int y = s.nextInt();
            switch (y) {
                case 1:
                    if (!"X".equals(grid[0][0])) {
                        grid[0][0] = "O";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                    break;
                case 2:
                    if (!"X".equals(grid[0][1])) {
                        grid[0][1] = "O";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                    break;
                case 3:
                    if (!"X".equals(grid[0][2])) {
                        grid[0][2] = "O";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                    break;
                case 4:
                    if (!"X".equals(grid[1][0])) {
                        grid[1][0] = "O";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                    break;
                case 5:
                    if (!"X".equals(grid[1][1])) {
                        grid[1][1] = "O";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                    break;
                case 6:
                    if (!"X".equals(grid[1][2])) {
                        grid[1][2] = "O";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                    break;
                case 7:
                    if (!"X".equals(grid[2][0])) {
                        grid[2][0] = "O";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                    break;
                case 8:
                    if (!"X".equals(grid[2][1])) {
                        grid[2][1] = "O";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                    break;
                case 9:
                    if (!"X".equals(grid[2][2])) {
                        grid[2][2] = "O";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                    break;
                default:
                    System.out.println("Wrong Input\nMiss the Turn!");
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("| " + grid[i][j] + " |");
                }
                System.out.println();
            }

            if (grid[0][0].equals("O") && grid[0][1].equals("O") && grid[0][2].equals("O") || grid[1][0].equals("O") && grid[1][1].equals("O") && grid[1][2].equals("O") || grid[2][0].equals("O") && grid[2][1].equals("O") && grid[2][2].equals("O") || grid[0][0].equals("O") && grid[1][0].equals("O") && grid[2][0].equals("O") || grid[0][1].equals("O") && grid[1][1].equals("O") && grid[2][1].equals("O") || grid[0][2].equals("O") && grid[1][2].equals("O") && grid[2][2].equals("O") || grid[0][0].equals("O") && grid[1][1].equals("O") && grid[2][2].equals("O") || grid[0][2].equals("O") && grid[1][1].equals("O") && grid[2][0].equals("O")) {
                System.out.print("O Wins!");
                return;
            }
        }

        System.out.println();
        System.out.println("Tie!");
    }
    public static void TTT_AI() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = " ";
            }
        }
        int g = 1;
        while (g <= 9) {
// Turn for Player
            System.out.print("Turn for Player : ");
            int x = s.nextInt();
            switch (x) {
                case 1 -> {
                    if (!"O".equals(grid[0][0])) {
                        grid[0][0] = "X";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                }
                case 2 -> {
                    if (!"O".equals(grid[0][1])) {
                        grid[0][1] = "X";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                }
                case 3 -> {
                    if (!"O".equals(grid[0][2])) {
                        grid[0][2] = "X";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                }
                case 4 -> {
                    if (!"O".equals(grid[1][0])) {
                        grid[1][0] = "X";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                }
                case 5 -> {
                    if (!"O".equals(grid[1][1])) {
                        grid[1][1] = "X";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                }
                case 6 -> {
                    if (!"O".equals(grid[1][2])) {
                        grid[1][2] = "X";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                }
                case 7 -> {
                    if (!"O".equals(grid[2][0])) {
                        grid[2][0] = "X";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                }
                case 8 -> {
                    if (!"O".equals(grid[2][1])) {
                        grid[2][1] = "X";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                }
                case 9 -> {
                    if (!"O".equals(grid[2][2])) {
                        grid[2][2] = "X";
                        g++;
                    }
                    else
                        System.out.println("Already Occupied\nMiss the Turn!");
                }
                default -> System.out.println("Wrong Input\nMiss the Turn!");
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("| " + grid[i][j] + " |");
                }
                System.out.println();
            }
            if (grid[0][0].equals("X") && grid[0][1].equals("X") && grid[0][2].equals("X") ||
                    grid[1][0].equals("X") && grid[1][1].equals("X") && grid[1][2].equals("X") ||
                    grid[2][0].equals("X") && grid[2][1].equals("X") && grid[2][2].equals("X") ||
                    grid[0][0].equals("X") && grid[1][0].equals("X") && grid[2][0].equals("X") ||
                    grid[0][1].equals("X") && grid[1][1].equals("X") && grid[2][1].equals("X") ||
                    grid[0][2].equals("X") && grid[1][2].equals("X") && grid[2][2].equals("X") ||
                    grid[0][0].equals("X") && grid[1][1].equals("X") && grid[2][2].equals("X") ||
                    grid[0][2].equals("X") && grid[1][1].equals("X") && grid[2][0].equals("X")) {
                System.out.print("X Wins!");
                return;
            }
            if (g > 9) {
                System.out.print("Tie");
                return;
            }
//Turn for AI
            System.out.println("AI plays:");
            Move bestMove = findBestMove(grid);
            grid[bestMove.row][bestMove.col] = "O";
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("| " + grid[i][j] + " |");
                }
                System.out.println();
            }
            if (grid[0][0].equals("O") && grid[0][1].equals("O") && grid[0][2].equals("O") ||
                    grid[1][0].equals("O") && grid[1][1].equals("O") && grid[1][2].equals("O") ||
                    grid[2][0].equals("O") && grid[2][1].equals("O") && grid[2][2].equals("O") ||
                    grid[0][0].equals("O") && grid[1][0].equals("O") && grid[2][0].equals("O") ||
                    grid[0][1].equals("O") && grid[1][1].equals("O") && grid[2][1].equals("O") ||
                    grid[0][2].equals("O") && grid[1][2].equals("O") && grid[2][2].equals("O") ||
                    grid[0][0].equals("O") && grid[1][1].equals("O") && grid[2][2].equals("O") ||
                    grid[0][2].equals("O") && grid[1][1].equals("O") && grid[2][0].equals("O")) {
                System.out.print("O Wins!");
                return;
            }
            g++;
        }
        System.out.print("Tie");

    }



// This function returns true if there are moves
// remaining on the board. It returns false if
// there are no moves left to play.
    static Boolean isMovesLeft(String[][] grid) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (" ".equals(grid[i][j]))
                    return true;
            }
        }
        return false;
    }

    static int evaluate(String[][] b) {
        // Checking for Rows for X or O victory.
        for (int row = 0; row < 3; row++) {
            if (b[row][0].equals(b[row][1]) && b[row][1].equals(b[row][2])) {
                if (b[row][0].equals(computer))
                    return +10;
                else if (b[row][0].equals(human))
                    return -10;
            }
        }

        // Checking for Columns for X or O victory.
        for (int col = 0; col < 3; col++) {
            if (b[0][col].equals(b[1][col]) && b[1][col].equals(b[2][col])) {
                if (b[0][col].equals(computer))
                    return +10;

                else if (b[0][col].equals(human))
                    return -10;
            }
        }

        // Checking for Diagonals for X or O victory.
        if (b[0][0].equals(b[1][1]) && b[1][1].equals(b[2][2])) {
            if (b[0][0].equals(computer))
                return +10;
            else if (b[0][0].equals(human))
                return -10;
        }

        if (b[0][2].equals(b[1][1]) && b[1][1].equals(b[2][0])) {
            if (b[0][2].equals(computer))
                return +10;
            else if (b[0][2].equals(human))
                return -10;
        }

        // Else if none of them have won then return 0
        return 0;
    }

// This is the minimax function. It considers all
// the possible ways the game can go and returns
// the value of the board
    static int minimax(String[][] grid, int depth, Boolean isMax) {
        int score = evaluate(grid);

        // If Maximizer has won the game
        // return evaluated score
        if (score == 10)
            return score;

        // If Minimizer has won the game
        // return evaluated score
        if (score == -10)
            return score;

        // If there are no more moves and
        // no winner then it is a tie
        if (!isMovesLeft(grid))
            return 0;

        // If this maximizer's move
        if (isMax) {
            int best = -1000;

            // Traverse all cells
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    // Check if cell is empty
                    if (grid[i][j].equals(" ")) {
                        // Make the move
                        grid[i][j] = computer;

                        // Call minimax recursively and choose
                        // the maximum value
                        best = Math.max(best, minimax(grid, depth + 1, !isMax));

                        // Undo the move
                        grid[i][j] = " ";
                    }
                }
            }
            return best;
        }

        // If this minimizer's move
        else {
            int best = 1000;

            // Traverse all cells
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    // Check if cell is empty
                    if (grid[i][j].equals(" "))
                    {
                        // Make the move
                        grid[i][j] = human;

                        // Call minimax recursively and choose
                        // the minimum value
                        best = Math.min(best, minimax(grid, depth + 1, !isMax));

                        // Undo the move
                        grid[i][j] = " ";
                    }
                }
            }
            return best;
        }
    }

// This will return the best possible
// move for the player
    static Move findBestMove(String[][] grid) {
        int bestVal = -1000;
        Move bestMove = new Move();
        bestMove.row = -1;
        bestMove.col = -1;

        // Traverse all cells, evaluate minimax function
        // for all empty cells. And return the cell
        // with optimal value.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Check if cell is empty
                if (grid[i][j].equals(" ")) {
                    // Make the move
                    grid[i][j] = computer;

                    // compute evaluation function for this
                    // move.
                    int moveVal = minimax(grid, 0, false);

                    // Undo the move
                    grid[i][j] = " ";

                    // If the value of the current move is
                    // more than the best value, then update
                    // best/
                    if (moveVal > bestVal) {
                        bestMove.row = i;
                        bestMove.col = j;
                        bestVal = moveVal;
                    }
                }
            }
        }
//The value of the best Move is 'bestVal'
        return bestMove;
    }
}