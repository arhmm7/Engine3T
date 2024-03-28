import java.util.*;
class TicTacToe {
	public static void main(String[] args) {
		Board br = new Board();
		GameLogic gl = new GameLogic();
		Scanner scn = new Scanner(System.in);

		System.out.println("Select Player : \n1) X \n2) O");
		int ply = scn.nextInt();
		String Player_1 = (ply==1) ? "X" : "O";
		String Player_2 = (ply==1) ? "O" : "X";

		System.out.println("Game Starts :");
		br.Init();
		br.printBoard();

		String[][] tempBoard = new String[3][3];
		int inp = 0, move = 1;
		boolean gameRunning = true , PLAYER_1_PLAYS = true;

		while (gameRunning) {
			tempBoard = br.getBoard();
			if (!gl.checkWin(tempBoard) && move < 9) {
				if (PLAYER_1_PLAYS) {
					inp = scn.nextInt();
					br.setBoard(gl.getX(inp), gl.getY(inp), Player_1);
					System.out.println("Move :" + move);
					br.printBoard();
					PLAYER_1_PLAYS = false;
					move = move + 1;
				} 
				else {
					inp = scn.nextInt();
					br.setBoard(gl.getX(inp), gl.getY(inp), Player_2);
					System.out.println("Move :" + move);
					br.printBoard();
					PLAYER_1_PLAYS = true;
					move = move + 1;
				}
			} 
			else {
				if (move >= 9) {
					System.out.println("Draw");
					gameRunning = false;

				} 
				else {
					if (!PLAYER_1_PLAYS) {
						System.out.println(Player_1 + " wins");
					} else {
						System.out.println(Player_2 + " wins");
					}
					gameRunning = false;
				}
			}
		}
		scn.close();
	}
}